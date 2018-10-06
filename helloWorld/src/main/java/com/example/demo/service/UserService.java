package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class UserService {
	  public String getUserId(){
		  System.out.println("進入了UserService的getUserId方法");
		  String userId="5";
		  return userId;
	  }
}
