package food.com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SuperUser 
{
	@Id
	int id;
	String name,password;
	
	public SuperUser(int id, String name, String password)
	{
		this.id=id;
		this.name=name;
		this.password=password;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
}
