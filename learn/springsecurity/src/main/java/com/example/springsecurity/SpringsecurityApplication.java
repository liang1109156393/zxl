package com.example.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsecurityApplication {
	/* WebSecurityConfigurerAdapter 文件配置类中配置过滤器。
	*  在执行AbstractAuthenticationProcessingFilter权限认证抽象类时候，执行子类的attemptAuthentication
	*  返回一个Authentication 是通过AuthenticationManager的authenticate方法返回也就是执行ProviderManager的authenticate方法
	*  在ProviderManager中执行AuthenticationProvider的authenticate方法实现用户认证
	*  userDetailsService.loadUserByUsername返回返回一个Authentication
	*  认证成功或失败执行AbstractAuthenticationProcessingFilter的子类的successfulAuthentication或者unsuccessfulAuthentication
	*  AbstractSecurityInterceptor权限认证 beforeInvocation()方法中 调用this.obtainSecurityMetadataSource()
		.getAttributes(object)查询所有权限，执行accessDecisionManager.decide的方法验权是否有。
	*
	* */
	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}

}
