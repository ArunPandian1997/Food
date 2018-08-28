package food.com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item 
{
	@Id
	int id;
	String name;
	
	Item(String name)
	{
		this.name=name;
	}
	
	String getName()
	{
		return name;
	}
}
