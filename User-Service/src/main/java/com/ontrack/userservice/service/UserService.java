package com.ontrack.userservice.service;

import com.ontrack.userservice.modal.User;

import java.util.List;

public interface UserService {
    public User getUserProfile(String jwt);
    public List<User> getAllUsers();
}
