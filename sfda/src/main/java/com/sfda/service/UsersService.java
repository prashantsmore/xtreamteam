package com.sfda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.sfda.entity.Users;
import com.sfda.repository.UsersRepository;

@Component
public class UsersService {
	
	private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
    
    public Optional<Users> findUserById(Long id) {
        return usersRepository.findById(Long.valueOf(id).intValue());
    }
    
    public Users saveUser(Users users) {
    	return usersRepository.save(users);
    }
}