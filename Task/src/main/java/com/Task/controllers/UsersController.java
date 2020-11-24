package com.Task.controllers;

import com.Task.models.User;
import com.Task.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    @ResponseBody
    public void getUsersPage(){
        List<User> users = userRepository.findAll();
        for(User user : users){
            System.out.println(user.getName()+"|"+user.getSecondName()+"|"+user.getEmail()+"|"+user.getRole()+"|"+
                    user.getMobile());
        }
    }
}
