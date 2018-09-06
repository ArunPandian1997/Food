package food.com.project.repository;

import food.com.project.model.OrderLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLogRepository extends JpaRepository<OrderLog,Long>
{

}
