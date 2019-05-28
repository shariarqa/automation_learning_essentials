package com.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentsTestNG {

	@Test(priority = 1, groups= {"regression"})
	public void test1() {
		Assert.assertTrue(true);
	}
	@Test(priority = 2, groups= {"regression"},dependsOnMethods= {"test1"})
	public void test2() {
		System.out.println("test 2 pass");
	}
	@Test(dependsOnMethods= {"test1","test2"})
	public void test3() {
		System.out.println("test 3 pass");
	}
	
	@Test(groups= {"sanity"})
 	public void test4() {
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods= {"test4"})
	public void test5() {
		Assert.assertTrue(false);
	}
}
