package softuniBlog.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.User;
/**
 * Created by Flex on 30.11.2016 г..
 */

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}