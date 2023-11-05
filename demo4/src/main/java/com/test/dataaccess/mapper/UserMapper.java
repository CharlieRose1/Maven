package com.test.dataaccess.mapper;

import com.test.dataaccess.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    static UserDO insertUser(UserDO userDO)  // 新增资产
    {
        return null;
    }

    static UserDO selectUserById(@Param("id") Long id)  // 资产详情
    {
        return null;
    }

    static List<UserDO> selectAllUsers()  // 查询所有资产
    {
        return null;
    }

    static List<UserDO> selectUsersByPage(@Param("offset") int offset, @Param("limit") int limit)  // 资产分页接口
    {
        return null;
    }

    static Integer updateUser(UserDO userDO)  // 修改资产
    {
        return null;
    }

}