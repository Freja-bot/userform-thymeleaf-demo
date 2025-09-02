package com.example.userformthymeleaf.repository;

import com.example.userformthymeleaf.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();
    private int userId;


    private int nextUserId() {
        return ++userId;
    }

    public List<User> getAllUsers(){
        return users;
    }

    public User addUser(User user){
        user.setUserId(nextUserId());
        users.add(user);
        return user;
    }


    public User getUserById(int userId) {
        for(User user : users){
            if(user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }

    public void updateUser(User user) {
        for(User oldUser : users){
            if(oldUser.getUserId() == user.getUserId()){
                users.remove(oldUser);
                users.add(user);
            }
        }
    }
}
