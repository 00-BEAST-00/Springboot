package com.samco.service;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samco.model.User;

@Service
public class Userserviceimp implements Userservice{

	@Override
	public List<User> getAllusers() {
		// TODO Auto-generated method stub
		return this.users;
	}
	 List<User> users = new LinkedList<User> ();
	public Userserviceimp() {
		
		users.add(new User(1,"Nitheesh","nitheesh@samco.in","10/10/2000"));
		users.add(new User(2,"Dileep","dileep@samco.in","09/05/2001"));
		users.add(new User(3,"Kalai","kalaiselvan@samco.in","04/03/2000"));
		users.add(new User(4,"Ranjith","ranjith@samco.in","02/02/2000"));
		users.add(new User(5,"Kalaiselvan","kalaiselvan@samco.in","04/03/2000"));
		users.add(new User(6,"yamini","yamini@samco.in","01/02/2000"));
	}
	@Override
	public User getuser(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}
	}