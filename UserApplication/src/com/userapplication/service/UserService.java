package com.userapplication.service;

import com.userapplication.bean1.UserBean;
import com.userapplication.dao.UserDAO;

public class UserService {

	UserDAO dao = new UserDAO();
	
	public int addUSer(UserBean ub)
	{
		return dao.insertUser(ub);
	}
	
	public boolean check(String userName,String password)
	{
		return dao.check(userName, password);
	}
}
