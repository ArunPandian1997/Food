package food.com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import food.com.project.model.SuperUser;
import food.com.project.repository.SuperUserRepository;

@RestController
public class SuperUserController 
{
	@Autowired
	SuperUserRepository superUserRepository;
	
	@RequestMapping(value="/superuser/{id}", method=RequestMethod.GET)
	String getAdmin(@PathVariable("id") long id)
	{
		return superUserRepository.getOne(id).getPassword();
	}
	
	@RequestMapping(value="/superuser/{name}/{password}", method=RequestMethod.POST)
	void addUser(@PathVariable("name") String name, @PathVariable("password") String password)
	{
		superUserRepository.deleteById((long) 2);
		superUserRepository.save(new SuperUser(2,name,password));
	}
}