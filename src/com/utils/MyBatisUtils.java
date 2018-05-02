package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {

    public static SqlSession getSqlSession(){
        //主配置文件的位置字符串
        String resource = "SqlMapConfig.xml";
        //建立输入流准备读取配置文件
        InputStream inputStream = null;

        try {
            //将主配置文件转换为输入流
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new
        SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

}
