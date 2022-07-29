package com.cos.blog.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice	// 모든 익셉션이 들어왔을 때 이 클래스로 오게 함
@RestController
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public String handleArgumentException(Exception e) {
		return "<h1>"+e.getMessage()+"</h1>";
	}
}
