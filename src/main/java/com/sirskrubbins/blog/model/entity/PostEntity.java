package com.sirskrubbins.blog.model.entity;

import java.sql.Date;

public class PostEntity {
	private String userName;
	private Date created;
	private String title;
	
	
	public PostEntity() {
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	
	public void setCreatedDate(Date created) {
		this.created = created;
		}

	public Date getCreatedDate() {
		return created;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	

}
