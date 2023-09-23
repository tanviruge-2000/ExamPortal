package com.exam.service.impl;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userReoository;

    @Autowired
    private RoleRepository roleRepository;


    //creating user

    @Override
    public User createUser(User user, Set<UserRole> userRole) throws Exception {

        User local= this.userReoository.findByUserName(user.getUsername());

        if(local!=null)
        {
            System.out.println("User is allrady there!!");
            throw new Exception("User alrady present!!");
        }else {
            //user create
            for (UserRole ur:userRole)
            {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll((userRole));
            local=this.userReoository.save(user);


        }
        return local;
    }
}
