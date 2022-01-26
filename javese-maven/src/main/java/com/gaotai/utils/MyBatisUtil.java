package com.gaotai.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author： hzm
 * @date： 2022/1/26 9:38
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class MyBatisUtil {
    // 定义 SqlSessionFactory
    private static SqlSessionFactory factory ;

    static {
        // 使用 静态块 创建一次 SqlSessionFactory
        try {
            String config = "mybatis.xml";
            // 读取配置文件
            InputStream in = Resources.getResourceAsStream(config);
            // 创建 SqlSessionFactory 对象
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (Exception e) {
            factory = null;
            e.printStackTrace();
        }
    }

    /*  获取 SqlSession  对象 */
    public static SqlSession getSqlSession() {
        SqlSession session = null;
        if (factory != null) {
            //自动提交
            session = factory.openSession(true);
        }
        return session;
    }
}
