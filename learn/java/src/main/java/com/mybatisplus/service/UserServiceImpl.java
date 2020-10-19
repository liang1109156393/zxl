package com.mybatisplus.service;

import com.mybatisplus.dto.UserMapper;
import com.mybatisplus.entity.User;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-19 13:46
 **/
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService{
}
