package com.dataSink.platform.service;

import com.dataSink.platform.dao.UserMapper;
import com.dataSink.platform.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huanglijun on 2018/10/29.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User GetUserByID(int id){
        return userMapper.getUserByID(id);
    }
}
