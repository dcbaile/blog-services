package com.sirskrubbins.blog.service;

import com.sirskrubbins.blog.model.entity.PostEntity;
import com.sirskrubbins.blog.repository.PostRepository;

public class PostService {
	
	PostRepository repository;
	
	public PostService() {
		repository = new PostRepository();
	}

	public PostEntity getPost() {
		return repository.findPost();
	}
}
