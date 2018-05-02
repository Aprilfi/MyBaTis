package com.dao;

import com.pojo.Category;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface GoodsDao {

    public Category findById(int gid) throws IOException;

    public List<Category> findAll();

    public void delete(int gid);

    public void update( Category category );

    public List<Category> findByKind(String gkind);

    public void addGoods(Category category);

    public List<Category> pageQuery(Map<String,Integer> params);

}
