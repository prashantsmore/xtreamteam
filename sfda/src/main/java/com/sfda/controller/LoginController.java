package com.sfda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfda.entity.Users;
import com.sfda.links.UserLinks;
import com.sfda.service.UsersService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	UsersService usersService;
	
	public LoginController(UsersService usersService) {
		this.usersService = usersService;
	}
	
	@PostMapping(path = UserLinks.REGISTER_USER)
    public ResponseEntity<?> registerUser(@RequestBody Users user) {
		log.info("In registerUser");
		Users resource = usersService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = UserLinks.LOGIN_USER)
	public ResponseEntity<?> loginUser(String email, String password) {
		log.info("In loginUser");
        return ResponseEntity.ok("SUCCESS");//TODO
    }
	
	@PostMapping(path = UserLinks.FORGET_PASSWORD)
	public ResponseEntity<?> resetPassword(@RequestBody Users user) {
		log.info("In resetPassword");
		usersService.resetPassword(user);
		//TODO - implementation - send reset password link to the given email address
        return ResponseEntity.ok("Link Sent");
    }
}
