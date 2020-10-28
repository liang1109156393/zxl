package com.basic.collection;

import com.baomidou.mybatisplus.extension.api.R;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-28 13:46
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }
        list.forEach(e->{
            System.out.println("d");
        });

    }



}
