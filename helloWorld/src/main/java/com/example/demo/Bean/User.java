package com.example.demo.Bean;

import org.springframework.stereotype.Component;

//https://ithelp.ithome.com.tw/articles/10194657
@Component
public class User {
	
	/*
	 * 
在MemberAccount上方我宣告了一個@Component註解,只是要讓此類可被Controller注入
@Component
@Service
@Repository
@RestController
@Controller
這五個註解會在Spring Boot Starter一啟動後就做掃描,傳統的我們
	 */
	  private int id;
	  private String name;
	  private String hight;
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHight() {
		return hight;
	}
	public void setHight(String hight) {
		this.hight = hight;
	}

}
