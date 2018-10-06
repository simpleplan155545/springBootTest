package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.userDao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	  public String getUserId(){
		  System.out.println("進入了UserService的getUserId方法");
//		  String userId="5";
//		  return userId;
		  userDao.addUser("1");
		  return "OK";
	  }
}
