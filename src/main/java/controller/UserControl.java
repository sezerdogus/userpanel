package controller;
import java.util.ArrayList;

import service.UserService;
import userlist.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import userlist.User;

@Controller
@RequestMapping("/users")
public class UserControl {

	@Autowired
	private UserService service;
	
	@RequestMapping
	public String getUsersPage() {
		return "users";
	}
	
	@RequestMapping(value="/records")
	public @ResponseBody UserTable getUsers() {
		
		UserTable userTable = new UserTable();
		userTable.setUserList((ArrayList<User>) service.readAll());
		
		return userTable;
	}
	
	@RequestMapping(value="/get")
	public @ResponseBody User get(@RequestBody User user) {
		return service.read(user);
	}
 
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody User create(
			@RequestParam String firstName,
			@RequestParam String lastName,
			@RequestParam String phoneNo) {
 

		
		User newUser = new User();
		newUser.setName(firstName);
		newUser.setSurname(lastName);
		newUser.setPhoneNo(phoneNo);
		
		return service.create(newUser);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public @ResponseBody User update(
			@RequestParam String firstName,
			@RequestParam String lastName,
			@RequestParam String phoneNo) {
 
		
		User existingUser = new User();
		existingUser.setName(firstName);
		existingUser.setSurname(lastName);
		existingUser.setPhoneNo(phoneNo);
		
		return service.update(existingUser);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public @ResponseBody Boolean delete(
			@RequestParam String username) {
 
		User existingUser = new User();
		existingUser.setName(username);
		
		return service.delete(existingUser);
	}
	
}
