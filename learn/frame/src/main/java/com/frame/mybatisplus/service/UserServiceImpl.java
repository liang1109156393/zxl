package com.frame.mybatisplus.service;

import com.frame.mybatisplus.dto.UserMapper;
import com.frame.mybatisplus.entity.User;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-19 13:46
 **/
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService{
}
