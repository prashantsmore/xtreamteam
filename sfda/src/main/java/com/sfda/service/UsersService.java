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
    
    public Optional<Users> findUserById(int id) {
        return usersRepository.findById(id);
    }
    
    public Users saveUser(Users users) {
    	return usersRepository.save(users);
    }
    
    public Users resetPassword(Users users) {
    	List<Users> userList = usersRepository.findAll();
    	//TODO - scan all users and check if user exists
    	return userList.get(0);
    }
}