package com.deng.test;

import com.deng.dao.UserDao;
import com.deng.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author DengShenglin
 **/
public class TestMybatis {

    /*
     * 测试查询用户数据
     */
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建Sqlsession工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建session对象(打开工厂)
        SqlSession session = factory.openSession();
        //获取代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //查询所有数据信息
        List<User> list=userDao.findAll();
        for (User user:list){
            System.out.println(user);
        }
        //关闭资源
        session.close();
        in.close();
    }


    /*
     * 测试保存用户数据
     */
    @Test
    public void run2() throws Exception {

        User user = new User();
        user.setUsername("c");
        user.setPassword("789");
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建Sqlsession工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建session对象(打开工厂)
        SqlSession session = factory.openSession();
        //获取代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //保存用户数据信息
        userDao.SaveUser(user);
        //提交事务
        session.commit();
        //关闭资源
        session.close();
        in.close();
    }
}
