package food.com.project.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import food.com.project.model.OrderLog;
import food.com.project.repository.OrderLogRepository;

@RestController
public class OrderLogController 
{
	@Autowired
	OrderLogRepository orderLogRepository;
	
	@RequestMapping(value="/orderlog", method=RequestMethod.GET)
	Collection<OrderLog> getLog()
	{
		return orderLogRepository.findAll();
	}
	
	@RequestMapping(value="/orderlog/{itemId}/{totalQuantity}", method=RequestMethod.POST)
	void addOrder(@PathVariable long itemId, @PathVariable int totalQuantity)
	{
		orderLogRepository.save(new OrderLog(itemId,totalQuantity));
	}
}
