package org.sam.switchbd.service.postgres;

import org.sam.switchbd.entity.postgres.User;
import org.sam.switchbd.repository.postgres.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServive {

    private UserRepository userRepository;

    public UserServive(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
}
