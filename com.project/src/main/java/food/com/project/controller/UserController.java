package food.com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import food.com.project.model.Users;
import food.com.project.repository.UserRepository;

@RestController
public class UserController 
{
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	List<Users> getUsers()
	{
		return userRepository.findAll();
	}
	
	@RequestMapping(value="/users/{id}/{name}", method=RequestMethod.POST)
	void addUser(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		userRepository.save(new Users(id,name));
	}
}