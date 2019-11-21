package com.lin.controller;

import com.lin.mapper.UserMapper;
import com.lin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: jacklin
 * @Date: 2019/11/21 17:16
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    //选择全部用户
    @GetMapping("/queryUser")
    public String selectUser(){
        List<User> users = userMapper.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }

        return "查询成功";
    }
    //根据id选择用户
    @GetMapping("/queryUserById")
    public String selectUserById(){
        User user = userMapper.queryUserById(1);
        System.out.println(user);
        return "ok";
    }
    //添加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(6,"阿毛","456789"));
        return "用户增加成功";
    }
    //修改一个用户
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(6,"阿毛","421319"));
        return "修改用户成功";
    }
    //根据id删除用户
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(6);
        return "删除用户成功";
    }
}
