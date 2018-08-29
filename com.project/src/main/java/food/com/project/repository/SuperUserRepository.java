package food.com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.com.project.model.SuperUser;

@Repository
public interface SuperUserRepository extends JpaRepository<SuperUser,Long>
{
	
}
