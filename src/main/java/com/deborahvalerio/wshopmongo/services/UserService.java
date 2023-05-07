package com.deborahvalerio.wshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deborahvalerio.wshopmongo.domain.User;
import com.deborahvalerio.wshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository rep;
	
	public List<User> findAll(){
		return rep.findAll();
	}
}
