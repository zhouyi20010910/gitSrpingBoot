package com.zy.springBoot.main.service;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Repository;
//加入到ioc容器中，名字为studentService...
@Repository(value = "studentService")
public class studentService implements MethodBeforeAdvice{
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		
	}
}
