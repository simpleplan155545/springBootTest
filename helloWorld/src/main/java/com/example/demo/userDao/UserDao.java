package com.example.demo.userDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Bean.User;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addUser(String a) {
		System.out.println("EXCUTE INSERT User");
		jdbcTemplate.update("INSERT INTO BoyUser(Id, Name,Hight) " + "VALUES (?,?,?)", 5, "Hank", "170");
	}
}
