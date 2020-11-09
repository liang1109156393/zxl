package com.frame.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.frame.mybatisplus.common.BaseInputEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-16 13:34
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user")
public class User extends BaseInputEntity {
    private String name;
    private int age;
    private String email;
    @TableLogic
    private Boolean deleted;
}
