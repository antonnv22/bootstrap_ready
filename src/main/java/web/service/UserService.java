package web.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import web.model.User;
import java.util.Optional;

public interface UserService {
    void createUser(User user);
    Iterable<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(User user);
    Optional<User> getUserById(Long id);
}
