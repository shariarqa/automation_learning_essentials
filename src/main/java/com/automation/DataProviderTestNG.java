package com.automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	
	@DataProvider
	public Object[][] testData(){
		Object[][] data = new Object [2][2];
		
		data[0][0]="test1";
		data[0][1]="test2";
		
		data[1][0]="test3";
		data[1][1]="test4";
		return data;
		
		
	}
	
	
	@Test(dataProvider="testData")
	public void test(String s1, String s2) {
		System.out.println("s1"+" "+s1+ "s2" + " " +s2);
	}

	@DataProvider
	public Object[][] testData1() {
		
		Object [][] data1 = new Object[3][3];	
		
		data1[0][0]="Rana";
		data1[0][1]="Rana1";
		data1[0][2]="Rana2";
		
		data1[1][0]="Rana3";
		data1[1][1]="Rana4";
		data1[1][2]="Rana5";
		
		data1[2][0]="Rana3";
		data1[2][1]="Rana4";
		data1[2][2]="Rana5";
		return data1;
	}
	
	@Test(dataProvider="testData1")
	public void test1(String s1, String s2, String s3) {
		System.out.println("s1"+" "+s1+ "s2" + " " +s2+" s3"+ " " +s3);
	}
	
	@DataProvider
	public void testData2(){
		
		Object [][] data2 = new Object[3][3];	
		
		
		
		
	}
}

