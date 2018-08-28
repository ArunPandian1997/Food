package food.com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users
{
	@Id
	int id;
	String name;
	
	Users()
	{
		
	}
	
	public Users(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	
	void setId(int id)
	{
		this.id=id;
		System.out.println(id);
	}
}
