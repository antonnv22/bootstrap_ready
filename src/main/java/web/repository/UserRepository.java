package web.repository;

import org.springframework.data.repository.CrudRepository;
import web.model.*;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
    User findByEmail(String email);
}

