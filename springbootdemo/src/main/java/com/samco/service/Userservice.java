package com.samco.service;

import java.util.List;

import com.samco.model.User;
public interface Userservice {
	 List<User> getAllusers();
	 User getuser(Integer userid);
}
