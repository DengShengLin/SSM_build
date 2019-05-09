package com.deng.service.impl;

import com.deng.domain.User;
import com.deng.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DengShenglin
 *
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        System.out.printf("业务层。查询所有用户信息");
        return null;
    }

    @Override
    public void SaveUser(User user) {
        System.out.printf("业务层。保存用户信息");
    }
}
