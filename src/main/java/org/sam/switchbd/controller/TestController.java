package org.sam.switchbd.controller;

import org.sam.switchbd.entity.mysql.RolUser;
import org.sam.switchbd.entity.postgres.User;
import org.sam.switchbd.service.mysql.RolService;
import org.sam.switchbd.service.postgres.UserServive;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/databases")
public class TestController {

    private RolService rolService;
    private UserServive userServive;

    public TestController(RolService rolService, UserServive userServive) {
        this.rolService = rolService;
        this.userServive = userServive;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/rol")
    public void registerRol(@RequestBody RolUser rol){
        rolService.saveRol(rol);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/user")
    public void registerUser(@RequestBody User user){
        userServive.saveUser(user);
    }
}
