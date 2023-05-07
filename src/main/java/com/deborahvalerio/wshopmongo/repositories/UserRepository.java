package com.deborahvalerio.wshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deborahvalerio.wshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
