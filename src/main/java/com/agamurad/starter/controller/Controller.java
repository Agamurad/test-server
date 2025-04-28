package com.agamurad.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agamurad.starter.model.User;

@RestController
public class Controller {

	@GetMapping(path = "/hello")
	public User getAllTodo() {
		User user = new User(); 
        User returnedUser = user.getAll();

        System.out.println(returnedUser.getName());

        return returnedUser;
	}
}
