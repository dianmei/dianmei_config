package com.itmuch.cloud.dianmei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazonaws.auth.policy.Principal;

/**
 * 使用@EnableZuulProxy注解激活zuul。
 * 跟进该注解可以看到该注解整合了@EnableCircuitBreaker、@EnableDiscoveryClient，是个组合注解，目的是简化配置。
 * @author linyue
 */
@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Sso
public class ZuulApiGatewayApplication {
	
	 @RequestMapping("/user")
	    public Principal user(Principal user) {
	        return user;
	    }	
  public static void main(String[] args) {
    SpringApplication.run(ZuulApiGatewayApplication.class, args);
  }
}
