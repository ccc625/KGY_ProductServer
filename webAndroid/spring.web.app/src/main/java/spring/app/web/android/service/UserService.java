package spring.app.web.android.service;

import object.User;

public class UserService 
{
	private final User user;
	private final String api;
	
	public UserService(String api, int id)
	{
		System.out.println("in UserService, api = " + api);
		
		this.user = new User(id);
		this.api = api;
	}
	
	public User getUser()
	{
		return user;
	}
	
	public String getApi()
	{
		return api;
	}
}
