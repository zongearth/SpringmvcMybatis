package com.tiger.kxz.controller;

import com.tiger.kxz.dao.UserMapper;
import com.tiger.kxz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 测试类
 */
@Controller
@RequestMapping("/testController")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(){
        Long id = 0000025L;
        User user = new User();
        user.setID(id);
        user.setLoginName("admin");
        user.setLoginPassWord("123");
        user.setName("小明");
        userMapper.insert(user);
        return "index";
    }

}
