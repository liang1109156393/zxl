package com.basic.collection;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

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

    public static void main(String [] args){
        new ArrayList<String>();
        SubThread1 subThread1=new SubThread1();
        subThread1.start();
        for (int i=0;i<=4;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==2){
                try {
                    subThread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class SubThread1 extends Thread{
    @Override
    public void run(){
        for (int i=6;i<=10;i++){
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
