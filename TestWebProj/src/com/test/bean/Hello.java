package com.test.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Hello {

	private String world = "Hello World!";
	
	public String getWorld(){
		return world;
	}
}
