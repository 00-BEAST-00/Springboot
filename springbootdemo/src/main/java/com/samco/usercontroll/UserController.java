package com.samco.usercontroll;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.samco.model.User;
import com.samco.service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	Userservice userService;
	@ResponseBody
	@RequestMapping("")
	public List<User> getAllusers() {
		return userService.getAllusers();
	}

	@ResponseBody
	@RequestMapping("/{id}")
	Map <String,Object> getUser(@PathVariable ("id") Integer id){
		Map <String,Object> map = new LinkedHashMap<>();
		map.put("Result","get user implementation");
		return map;
		
	}
	@ResponseBody
	@RequestMapping(value ="",method = RequestMethod.POST)
	Map <String,Object> createUser(){
		Map <String,Object> map = new LinkedHashMap<>();
		map.put("Result","Create user implementation");
		return map;
	}
	@ResponseBody
	@RequestMapping (value ="",method = RequestMethod.PUT)
	Map <String,Object> updateUser(){
		Map <String,Object> map = new LinkedHashMap<>();
		map.put("Result","Update user implementation");
		return map;
}
	@ResponseBody
	@RequestMapping (value ="",method = RequestMethod.DELETE)
	Map <String,Object> deleteUser(){
		Map <String,Object> map = new LinkedHashMap<>();
		map.put("Result","Delete user implementation");
		return map;
}
}
