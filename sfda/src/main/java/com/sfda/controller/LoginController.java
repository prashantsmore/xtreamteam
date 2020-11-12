package com.sfda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	UsersService usersService;
	
	@PostMapping(path = UserLinks.REGISTER_USER)
    public ResponseEntity<?> registerUser(@RequestBody Users user) {
        List<Users> resource = usersService.getUsers();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = UserLinks.LOGIN_USER)
	public ResponseEntity<?> loginUser(@RequestBody Users user) {
		Users resource = usersService.findUserById(123L).orElseGet(null);
        return ResponseEntity.ok(resource);
    }
}
