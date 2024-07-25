package com.product.ecommerce.controller;

import com.product.ecommerce.DTO.CreateUserDTO;
import com.product.ecommerce.model.User;
import com.product.ecommerce.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }


    @PostMapping("")
    public User createUser(@RequestBody CreateUserDTO createUserDTO){
        return userService.createUser(createUserDTO.getName(),createUserDTO.getEmail());

    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable("name") String name){
        return userService.getUser(name);
    }

}

