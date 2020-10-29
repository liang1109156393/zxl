package com.basic.collection;

import com.baomidou.mybatisplus.extension.api.R;

import java.lang.reflect.Array;
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
    /*数组的创建方式:
    *  String[] string = new String[length];
    * String[] string = {"1"};
    * String[] string = new String[]{"1"};
    *
    * ArrayList 有序的,可重复的,线程不安全。
    * 底层数组实现。扩容为原来的1.5倍 会出现fail-fast机制
    *
    *
    *
    *
    *
    * */









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
