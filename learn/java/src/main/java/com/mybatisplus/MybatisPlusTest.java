package com.mybatisplus;

import com.JavaApplication;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.dto.UserMapper;
import com.mybatisplus.entity.User;
import com.mybatisplus.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-16 14:24
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JavaApplication.class)
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService ;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
    @Test
    public void testPage(){
        Page<User> userPage = new Page<>();
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        Page<User> page = userMapper.selectPage(userPage, userQueryWrapper);
        System.out.println(page);
    }

    @Test
    public void update(){

    }
}
