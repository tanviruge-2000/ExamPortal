package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
