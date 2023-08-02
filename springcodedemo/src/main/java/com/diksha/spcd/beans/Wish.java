package com.diksha.spcd.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Wish implements InitializingBean,DisposableBean{
	private String message;
	public Wish() {
		System.out.println("Wish Bean/Object created");
	}
	public Wish(String message) {
		this.message=message;
	}
	public void setMessage(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public void wishInit() {
		System.out.println("Wish bean is initialized");
	}
	public void wishDestroy() {
		System.out.println("wish bean is about to be destroy");
	}
	public void afterPropertiesSet() {
		System.out.println("from afterPropertiesSet method");
	}
	public void destroy() {
		System.out.println("From DisposableBean.destory()");
	}
}
