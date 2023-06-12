package org.sam.switchbd.service.mysql;

import org.sam.switchbd.entity.mysql.RolUser;
import org.sam.switchbd.repository.mysql.RolRepository;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    private RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public void saveRol(RolUser rolUser){
        rolRepository.save(rolUser);
    }
}
