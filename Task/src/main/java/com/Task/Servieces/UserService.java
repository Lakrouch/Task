package com.Task.Servieces;

import com.Task.models.User;
import com.Task.repositories.UserRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@NoArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(String name, String secondname, String email, String role, String mobile){

        User user = new User(name, secondname, email, role, mobile);

        return user;
    }

}
