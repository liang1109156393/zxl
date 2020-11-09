package com.frame.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {
    @Value("${name}")
    private String name;

    /**
     * Spring中四种实例化bean的方式
     * 1、使用构造器实例化Bean
     * 2、使用静态工厂方式实例化Bean
     * 3、使用实例工厂方法实例化Bean
     * 4、用 setter 方式
     * <p>
     * Spring 注入方式
     * 1、构造函数
     * 2、set方法
     */
    public static void main(String[] args) {

        BeanUtils.instantiateClass(Application.class);
	/*	life();
		enable();
	}

	/*public static void life(){
		ConfigurableApplicationContext run = new SpringApplication(Application.class).run();
		Person person = (Person)run.getBean("person");
		String userName = person.getUser().getUserName();
		System.out.println(person.getAddress());
		System.out.println(userName);
	}
	public static void enable(){
		ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).web(WebApplicationType.NONE).run();
		// 验证我们的bean是否成功注入
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.test();
		HelloWorld2 helloWorld2 = context.getBean(HelloWorld2.class);
		helloWorld2.test();
		Application bean = context.getBean(Application.class);
		System.out.println(bean.name);

		log.info(context.getBean("testBean", String.class));
	}*/


    }
}
