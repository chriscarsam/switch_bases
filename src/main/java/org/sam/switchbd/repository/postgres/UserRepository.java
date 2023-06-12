package org.sam.switchbd.repository.postgres;

import org.sam.switchbd.entity.postgres.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
