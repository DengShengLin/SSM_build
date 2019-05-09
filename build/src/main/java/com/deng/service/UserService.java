package com.deng.service;

import com.deng.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DengShenglin
 *
 **/


public interface UserService {

    //查询所有用户
    public List<User> findAll();

    //保存账户信息
    public void SaveUser(User user);
}
