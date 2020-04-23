package br.brunocatao.regconfirm.repository;

import br.brunocatao.regconfirm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
