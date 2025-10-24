package mateusferrari.crud_users.repository;

import mateusferrari.crud_users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
