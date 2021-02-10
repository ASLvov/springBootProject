package edu.letscode.springBoot.repository;

import edu.letscode.springBoot.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
