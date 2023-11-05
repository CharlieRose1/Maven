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

    public UserDO addAsset(UserDO userDO) {
        assetMapper.insertUser(userDO);
        return userDO;

    }

    public UserDO getAssetById(Long id) {
        return assetMapper.selectUserById(id);
    }

    public List<UserDO> getAllAssets() {
        return assetMapper.selectAllUsers();
    }

    public List<UserDO> getAssetsByPage(int offset, int limit) {
        return assetMapper.selectUsersByPage(offset, limit);
    }



    public Integer updateAsset(UserDO userDO) {
        return assetMapper.updateUser(userDO);
    }
}