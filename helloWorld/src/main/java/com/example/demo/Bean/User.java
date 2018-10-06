package com.example.demo.Bean;

import org.springframework.stereotype.Component;

//https://ithelp.ithome.com.tw/articles/10194657
@Component
public class User {
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
