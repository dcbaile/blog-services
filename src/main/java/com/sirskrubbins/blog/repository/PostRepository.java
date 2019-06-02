package com.sirskrubbins.blog.repository;

import java.util.Calendar;
import java.util.Date;

import com.sirskrubbins.blog.model.entity.PostEntity;

public class PostRepository {
	
	PostEntity postEntity;
	
	public PostRepository() {
		postEntity = new PostEntity();
		postEntity.setTitle("Why Cheese smells so bad");
		postEntity.setUserName("overentusiasticCheeseGuy");
	}
	
	public PostEntity findPost() {
		return postEntity;
	}
	
	

}