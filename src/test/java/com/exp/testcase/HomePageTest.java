package com.exp.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.exp.base.Base;

public class HomePageTest extends Base {
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test
	public void login() {
		System.out.println("test");
	}

}
