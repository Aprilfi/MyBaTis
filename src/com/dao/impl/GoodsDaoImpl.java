package com.dao.impl;

import com.dao.GoodsDao;
import com.pojo.Category;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodsDaoImpl implements GoodsDao {
    @Override
    public Category findById(int gid) throws IOException {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        return sqlSession.selectOne("findById",gid);
    }

    @Override
    public List<Category> findAll() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        return sqlSession.selectList("listCategory");
    }

    @Override
    public void delete(int gid) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Category category = new Category();
        category.setGid(gid);
        sqlSession.delete("deleteById",gid);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Category category) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        sqlSession.update("updateById",category);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Category> findByKind(String gkind) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        return sqlSession.selectList("findByKind",gkind);
    }

    @Override
    public void addGoods(Category category) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        sqlSession.insert("addGoods",category);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Category> pageQuery(Map<String,Integer> params) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Map<String,Integer> paramMap = new HashMap<>();
        paramMap.put("limit",2);
        paramMap.put("offset",1);
        List<Category> categoryList = sqlSession.selectList("pageQuery",paramMap);
        return categoryList;
    }


}
