package pl.mmiskiewicz.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mmiskiewicz.springbootapp.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
