package net.cryls.backendcursojava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.cryls.backendcursojava.models.request.UserDetailRequestModel;
import net.cryls.backendcursojava.models.responses.UserRest;

@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class UserController {
    @GetMapping
    public String getUser() {
        return "Obtener usuarios";

    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailRequestModel userDetails) {
        return null;

    }
}
