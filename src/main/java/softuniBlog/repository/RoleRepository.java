package softuniBlog.repository;

/**
 * Created by Flex on 30.11.2016 г..
 */
import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}