package food.com.project.repository;

import food.com.project.model.Users;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>
{
	@Query(value="select * from users", nativeQuery=true)
	Collection<Users> findUsers();

}
