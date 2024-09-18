package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.User;

public interface UserService {
    public List<User> getUsers();
    public User saveUser(User user);
    public void deleteUser(Integer id);
    public User updateUser(Integer id, User user);
}
