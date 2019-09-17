package com.example.demo.repository;


import java.util.List;

import com.example.demo.domain.UserVO;


public interface UserRepository {
    List<UserVO> findAll();
}