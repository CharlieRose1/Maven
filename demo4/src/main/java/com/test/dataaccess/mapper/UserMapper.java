package com.test.dataaccess.mapper;

import com.test.dataaccess.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    UserDO insertAsset(UserDO userDO);  // 新增资产

    UserDO selectAssetById(@Param("id") Long id);  // 资产详情

    List<UserDO> selectAllAssets();  // 查询所有资产

    List<UserDO> selectAssetsByPage(@Param("offset") int offset, @Param("limit") int limit);  // 资产分页接口

    Integer updateAsset(UserDO userDO);  // 修改资产

}