package org.sam.switchbd.repository.mysql;

import org.sam.switchbd.entity.mysql.RolUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<RolUser, Long> {
}
