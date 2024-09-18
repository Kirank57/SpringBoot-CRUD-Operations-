package com.kodnest.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.kodnest.entity.User;
import com.kodnest.repository.UserRepo;
import com.kodnest.service.UserService;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserRepo repo;

	
	public List<User> getUsers() {
		return repo.findAll();
	}


	@Override
	public User saveUser(User user) {
		return repo.save(user);
	}


	public void deleteUser(@PathVariable Integer id) {
		  repo.deleteById(id);
	}

	public User UserGetById(Integer id) {
		return repo.findById(id).orElse(null);
	}

	public User updateUser(Integer id, User user) {
		return repo.save(user);
	}

}
