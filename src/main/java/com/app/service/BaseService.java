package com.app.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDAO;
import com.app.model.User;


@Service
public class BaseService {

	@Resource(name="userDAO")
	UserDAO userDAO;


	//图片保存
	@Transactional(propagation = Propagation.REQUIRED)
	public List<User> checklogin(String userName,String pwd) {
		return userDAO.checkUser(userName, pwd);

	}
	
	//图片保存
	@Transactional(propagation = Propagation.REQUIRED)
	public List<User> getAllUser() {
		return userDAO.getAllUser();
	}
	
	
}
