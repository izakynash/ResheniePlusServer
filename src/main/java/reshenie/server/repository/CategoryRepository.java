package reshenie.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reshenie.server.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
