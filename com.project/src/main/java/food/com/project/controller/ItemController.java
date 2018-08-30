package food.com.project.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import food.com.project.model.Item;
import food.com.project.repository.ItemRepository;

@RestController
public class ItemController 
{
	@Autowired
	ItemRepository itemRepository;
	
	@RequestMapping(value="/item", method=RequestMethod.GET)
	Collection<Item> getUsers()
	{
		return itemRepository.findAll();
	}
	
	@RequestMapping(value="/item/{id}/{name}", method=RequestMethod.POST)
	void addUser(@PathVariable("id") long id,@PathVariable("name") String name)
	{
		itemRepository.save(new Item(id,name));
	}
	
	@RequestMapping(value="/item/{id}", method=RequestMethod.DELETE)
	void deleteItem(@PathVariable("id") long id)
	{
		itemRepository.deleteById(id);
	}
}