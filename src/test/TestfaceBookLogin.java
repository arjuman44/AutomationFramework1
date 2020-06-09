package test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.pomFbLoginPage;

public class TestfaceBookLogin extends BaseTest
{
	
	@Test
	public void login() throws IOException
	{
	
		pomFbLoginPage login = new pomFbLoginPage(driver);
		login.loginMethod();
	}

}
