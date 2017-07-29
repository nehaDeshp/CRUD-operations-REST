package examples.useroperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import examples.useroperations.entity.User;
import examples.useroperations.interfaces.UserService;

@RestController
@RequestMapping(value = "/users")
@Component
public class UserController {
	
	@Autowired
	private UserService service;
	public UserController(UserService service) {
		this.service = service;
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<User> findAllUsers(){
		return service.findAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public User findOne(@PathVariable("id") String id) {
		return service.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody User user) {
		return service.create(user);
	}	
	
	@RequestMapping(method = RequestMethod.PUT, value="/{id}")
	public boolean updateUser(@PathVariable("id") String id) {
		return service.updateUser(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(User user) {
		
	}
}
