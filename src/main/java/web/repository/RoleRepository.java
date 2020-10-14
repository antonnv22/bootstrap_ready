package web.repository;

import org.springframework.data.repository.CrudRepository;
import web.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
