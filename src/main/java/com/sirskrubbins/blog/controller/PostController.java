package com.sirskrubbins.blog.controller;

import com.sirskrubbins.blog.model.entity.PostEntity;
import com.sirskrubbins.blog.service.PostService;

public class PostController {

	PostService service;
	
	public PostController() {
		service = new PostService();
	}
	
	public PostEntity getPost() {
		return service.getPost();
	}
	
	public static void main(String[] args) {
		PostEntity post;
		PostController controller = new PostController();
		post = controller.getPost();
		
		System.out.println(post.getTitle() + "\n By: " + post.getUserName());
	}
	
	

	
}
