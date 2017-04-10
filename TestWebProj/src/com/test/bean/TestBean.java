package com.test.bean;

import java.util.ArrayList;
import java.util.List;

public class TestBean {
	private String prop="hello";
	private List<String> vals=new ArrayList<String>();
	private List<Hello> arrs=new ArrayList<Hello>();
	private Hello hello;
	public String getProp(){
		return prop;
	}
	public void setProp(String prop){
		this.prop = prop;
	}
	public void addVals(String val){
		vals.add(val);
	}
	public List<String> getVals(){
		return vals;
	}
	public void setHello(Hello hello){
		this.hello = hello;
	}
	public Hello getHello(){
		return hello;
	}
	public List<Hello> getArrs(){
		return arrs;
	}
	public void addHello(Hello hello){
		arrs.add(hello);
	}
}
