package food.com.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderLog 
{
	@Id
	@GeneratedValue
	public long id;
	public long itemId;
	public Date date;
	public int totalQuantity;
	
	OrderLog()
	{
		
	}
	
	public OrderLog(long itemId, int totalQuantity)
	{
		this.itemId=itemId;
		this.totalQuantity=totalQuantity;
		date=new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
}
