package com.zeen.graduationdesign.controller;

import com.zeen.graduationdesign.entity.User;
import com.zeen.graduationdesign.result.Result;
import com.zeen.graduationdesign.service.UserService;
import com.zeen.graduationdesign.util.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/findPage")
    public Result findPage(@RequestBody PageRequest pageRequest) {
        return Result.success(userService.findPage(pageRequest));
    }

    @GetMapping("/getById")
    public Result getUserById(long id) {
        User user = userService.getUserById(id);
        return Result.success(user);
    }
}
