package com.exam;

import com.exam.model.User;
import com.exam.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashSet;

@SpringBootApplication(scanBasePackages={
		"com.exam"})
public class ExamserverApplication implements CommandLineRunner {

	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
//
//		User user=new User();
//		user.setFirstName( "Tanvi");
//		user.setLastName("Ruge");
//		user.setUsername("Tanvi1008");
//		user.setPassword("abc");
//		user.setEmail("abc@gmail.com");
//		user.setProfile("Default.png");
//
//		Role role1=new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRoles> userRolesSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role);
//		userRoleSet.add(userRole);
//
//		User user1=this.userService.createUser(user,userRolesSet);
//		System.out.println(user1.getUsername());


	}
}
