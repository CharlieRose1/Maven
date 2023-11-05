package com.test.service;

import com.test.dataaccess.entity.UserDO;
import com.test.dataaccess.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper assetMapper;

    public UserDO addUser(UserDO userDO) {
        UserMapper.insertUser(userDO);
        return userDO;

    }

    public UserDO getUserById(Long id) {
        return UserMapper.selectUserById(id);
    }

    public List<UserDO> getAllUsers() {
        return UserMapper.selectAllUsers();
    }

    public List<UserDO> getUsersByPage(int offset, int limit) {
        return UserMapper.selectUsersByPage(offset, limit);
    }


    public Integer updateUser(UserDO userDO) {
        return UserMapper.updateUser(userDO);
    }
}