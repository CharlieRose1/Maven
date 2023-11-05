package com.test.controller;
import com.test.dataaccess.entity.UserDO;
import com.test.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private AssetService assetService;

    @PostMapping("add")
    public ResponseEntity<UserDO> addAsset(@RequestBody UserDO userDO) {
      return  ResponseEntity.ok(assetService.addAsset(userDO));

    }

    @PostMapping("get")
    public UserDO getAssetById(@RequestBody UserDO userDO) {
        return assetService.getAssetById(userDO.getU_id());
    }

    @GetMapping("all")
    public List<UserDO> getAllAssets() {
        return assetService.getAllAssets();
    }

    @GetMapping("/page")
    public List<UserDO> getAssetsByPage(@RequestParam int offset, @RequestParam int limit) {
        return assetService.getAssetsByPage(offset, limit);
    }

    @PutMapping("/update/{id}")
    public Integer updateAsset(@PathVariable Long id, @RequestBody UserDO userDO) {
        userDO.setU_id(id);
        return assetService.updateAsset(userDO);
    }
}
