package br.com.gerenciamentoprojetos.repository;

import br.com.gerenciamentoprojetos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    public List findByName(String name);
}
