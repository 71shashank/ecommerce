package com.product.ecommerce.service;

import com.product.ecommerce.DTO.CreateUserDTO;
import com.product.ecommerce.model.User;
import com.product.ecommerce.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
//import com.product.ecommerce.model.User;

@Getter
@Setter
@Service
public class UserService {
    private UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public User createUser(String name, String email){
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;

    }

    public User getUser(String name) {
        return userRepository.findByName(name).get();
    }
}
