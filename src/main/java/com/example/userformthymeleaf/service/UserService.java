package com.example.userformthymeleaf.service;

import com.example.userformthymeleaf.model.User;
import com.example.userformthymeleaf.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public User addUser(User user){
        return userRepository.addUser(user);
    }


    public User getUserById(int userId) {
        User user = userRepository.getUserById(userId);
        return user;
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }
}
