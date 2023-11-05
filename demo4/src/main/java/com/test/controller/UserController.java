package com.test.controller;
import com.test.dataaccess.entity.UserDO;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService UserService;

    @PostMapping("add")
    public ResponseEntity<UserDO> addUser(@RequestBody UserDO userDO) {
      return  ResponseEntity.ok(UserService.addUser(userDO));

    }

    @PostMapping("get")
    public UserDO getUserById(@RequestBody UserDO userDO) {
        return UserService.getUserById(userDO.getU_id());
    }

    @GetMapping("all")
    public List<UserDO> getAllUsers() {
        return UserService.getAllUsers();
    }

    @GetMapping("/page")
    public List<UserDO> getUsersByPage(@RequestParam int offset, @RequestParam int limit) {
        return UserService.getUsersByPage(offset, limit);
    }

    @PutMapping("/update/{id}")
    public Integer updateUser(@PathVariable Long id, @RequestBody UserDO userDO) {
        userDO.setU_id(id);
        return UserService.updateUser(userDO);
    }
}
