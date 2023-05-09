package com.deborahvalerio.wshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deborahvalerio.wshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
