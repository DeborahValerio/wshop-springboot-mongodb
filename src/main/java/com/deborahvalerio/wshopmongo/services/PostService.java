package com.deborahvalerio.wshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deborahvalerio.wshopmongo.domain.Post;
import com.deborahvalerio.wshopmongo.repositories.PostRepository;
import com.deborahvalerio.wshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository rep;
	
	public Post findById(String id) {
		Optional<Post> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return rep.findByTitleContainingIgnoreCase(text);
	}
}
