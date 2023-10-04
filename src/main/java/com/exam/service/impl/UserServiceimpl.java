package com.exam.service.impl;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;
import com.exam.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Set;

public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    //creating user

    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local= this.userRepository.findByUsername(user.getUsername());

        if(local!=null)
        {
            System.out.println("User is allready there!!");
            throw new Exception("User allready present!!");
        }else {
            //user create
            for (UserRole ur:userRoles)
            {

                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local=this.userRepository.save(user);


        }
        return local;
    }
}
