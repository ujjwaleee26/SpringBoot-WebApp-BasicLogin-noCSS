package com.springBootWebApplication.myFirstSpringBootWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService 
{
  public boolean authenticate(String username,String password)
  {
	  if(username.equals("Ujjwal") && password.equals("123"))
	  {
		  return true;
	  }
	  else
		  return false;
  }
}
