package com.basic.design;

/**
 * @description:
 * @author: zxl
 * @create: 2020-11-19 19:32
 **/
public class CallBackTest {
    public static void main(String[] args) {
        ICallBack iCallBack = new ICallBack() {
            @Override
            public String sys(User user) {
                return user.getName();
            }
        };

        User user = new User();
        user.setName("zxl");

        String s = CallBackTest.callBackM(d -> (d.getName()), user);
        String b= CallBackTest.callBackM(iCallBack,user);



    }

    public static String  callBackM(ICallBack iCallBack,User user){
        String sys = iCallBack.sys(user);
        System.out.println(sys);
        return sys;
    }


}
interface ICallBack{
    String sys(User user);
}

class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

