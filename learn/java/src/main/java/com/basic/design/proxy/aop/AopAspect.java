package com.basic.design.proxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zxl
 * @create: 2020-11-05 09:50
 **/
@Aspect
@Component
public class AopAspect {
    @Pointcut(value = "execution(* say*(..))")
    public void pointCut (){

    }

    @Before(value = "pointCut()")
    private void beforeAdvice (){
        System.out.println("===========before advice param:");
    }

    @After( value = "pointCut()")
    private void afterAdvice (){
        System.out.println("===========after advice param:");
    }

    @Around(value = "pointCut()")
    private void aroundAdvice (ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("===========before advice param: around");
        pjp.proceed();
        System.out.println("===========after advice param: around");
    }

}
