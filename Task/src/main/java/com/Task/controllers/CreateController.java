package com.Task.controllers;

import com.Task.Servieces.Instruments;
import com.Task.Servieces.UserService;
import com.Task.models.User;
import com.Task.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CreateController {

    @Autowired
    private UserRepository userRepository;

    private Instruments instruments = new Instruments();

    private User user = new User();

    private UserService userService = new UserService();

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void createUser(@RequestParam String name, @RequestParam String secondname, @RequestParam String email,
                           @RequestParam String role, @RequestParam String mobile){
        user = userService.createUser(name, secondname, email, role, mobile);
        if (instruments.valid(email, mobile)){
            System.out.println("Saved");
            userRepository.save(user);
        }else{
            System.out.println("Error validation");
        }

    }

}
