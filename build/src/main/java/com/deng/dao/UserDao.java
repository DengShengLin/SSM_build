package com.deng.dao;

import com.deng.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author DengShenglin
 * 用户Dao接口
 **/
public interface UserDao {

    //查询所有用户
    @Select("select * from user")
    public List<User> findAll();

    //保存用户信息
    @Insert("insert into user(username,password) values(#{username},#{password})")
    public void SaveUser(User user);
}
