package com.test.bean;

@TestRefImpl2
public class AltTestRefBean implements ITestRefBean {

	@Override
	public String getTestRefValue() {
		return "AltTestRefValue";
	}

}
