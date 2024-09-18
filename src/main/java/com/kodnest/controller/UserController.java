package com.kodnest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.entity.User;
import com.kodnest.serviceimp.UserServiceImp;

@Controller
public class UserController {
	@Autowired
    UserServiceImp service;
	
	@GetMapping("/")
	public String getUsers(Model model) {
		model.addAttribute("user", service.getUsers());
		return "view";
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		  service.deleteUser(id);
		   return "redirect:/"; 
	}
	
   @GetMapping("/user")
    public String register(Model model,User user) {
    	model.addAttribute("user", user);
    	return "register";
    }
	
	@PostMapping("/registerUser")
	public String saveUser(User user) {
		service.saveUser(user);
		return "redirect:/";
	}
	
	@GetMapping("/user/{id}")
	public String updateUser(@PathVariable Integer id, Model model) {
		model.addAttribute("user",service.UserGetById(id));
		return "updateuser";
	}
	
	@PostMapping("/updateUser/{id}")
	public String updateUser(@PathVariable Integer id,@ModelAttribute User user,Model model) {
		service.saveUser(user);
		return "redirect:/";
	}
	
}
