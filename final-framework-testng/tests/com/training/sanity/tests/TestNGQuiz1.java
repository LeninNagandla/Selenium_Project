package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGQuiz1 {

	/*
	@Test
	public void A( ) {
			System.out.print("A method");
			Assert.assertEquals("vinay", "Ghouse");
		}
	@Test
	public void B( ) {
		System.out.print("B method");
		}
	@Test(priority=2)	
	public void C( ) {
		System.out.print("C method");
	}
	@Test(priority=1, dependsOnMethods="A", alwaysRun=true)	
	public void D( ) {
		System.out.print("D method");
	} */

		
@Test(priority=2)
public void A( ) {
		System.out.print("A method");
		Assert.assertEquals("vinay", "Ghouse");
	}
@Test(priority=3, dependsOnMethods="A")	
public void B( ) {
	System.out.print("B method");
	}
@Test(priority=4)	
public void C( ) {
	System.out.print("C method");
}
@Test(priority=1)
public void D( ) {
	System.out.print("D method");
}

}
