package com.example.demo.controller;

import com.example.demo.domain.UserVO;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository ;

    @RequestMapping(path= "/")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @RequestMapping(path= "/userId")
    @ResponseBody
    public String show(Model model) {
        UserVO vo = (UserVO) userRepository.findAll();

        return vo.getUserId();
    }
}