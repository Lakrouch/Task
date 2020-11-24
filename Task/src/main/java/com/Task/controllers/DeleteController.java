package com.Task.controllers;

import com.Task.models.User;
import com.Task.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam String email){
        User user = userRepository.findUserByEmail(email);
        System.out.println("User "+user.getId()+" deleted");
        userRepository.deleteById(user.getId());
    }
}
