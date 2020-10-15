package com.basic.proxy.JdkProxy.staticProxy;

import org.springframework.core.annotation.Order;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-24 14:41
 **/
public class UserDao implements IUserDTO {
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
