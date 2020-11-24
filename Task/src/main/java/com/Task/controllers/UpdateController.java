package com.Task.controllers;

import com.Task.Servieces.Instruments;
import com.Task.Servieces.UserService;
import com.Task.models.User;
import com.Task.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {

    @Autowired
    private UserRepository userRepository;

    private UserService userService = new UserService();
    private User user;
    private Instruments instruments = new Instruments();

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public void updateUser(@RequestParam Long id,
                           @RequestParam(defaultValue = "") String name,
                           @RequestParam(defaultValue = "") String secondname,
                           @RequestParam(defaultValue = "") String email,
                           @RequestParam(defaultValue = "") String role,
                           @RequestParam(defaultValue = "") String mobile) {

        user = userRepository.findUserById(id);
        System.out.println(user.getId()+","+user.getName()+","+user.getSecondName()+","+user.getEmail()+","+user.getRole()+","+user.getMobile());
        user = userService.updateUser(user, name, secondname, email, role, mobile);
        if (instruments.valid(user.getEmail(), user.getMobile())) {
            System.out.println("Saved");
            userRepository.save(user);
        } else {
            System.out.println("Error validation");
        }
    }
}
