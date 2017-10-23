package com.cm.xu.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.xu.pojo.User;
import com.cn.xu.service.IUserService; 

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  

public class UserTest {
	
	private ApplicationContext ac=null;
	
	@Resource
	private IUserService userService=null;
	
	
	@Before  
	public void before() {  
//	    ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//	    userService = (IUserService) ac.getBean("userService");  
//	    user=userService.getUserById(1);
	}  

	@Test
	public void test() {
		User user=userService.getUserById(1);
		System.out.println(user.getName());
	}

}
