package food.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.com.project.model.Item;

public interface ItemRepository extends JpaRepository<Item,Long>
{
	
}
