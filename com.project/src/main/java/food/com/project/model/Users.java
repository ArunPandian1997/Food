package food.com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users
{
	@Id
	public long id;
	public String name;
	
	Users()
	{
		
	}
	
	public Users(long id,String name)
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
	}
	
	void setId(long id)
	{
		this.id=id;
	}
}
