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
    private User user;

    public User createUser(String name, String secondname, String email, String role, String mobile){

        User user = new User(name, secondname, email, role, mobile);

        return user;
    }

    public void deleteUser(String email){
        System.out.println(email);
        user =(User) userRepository.findUserByEmail(email);
        userRepository.deleteUserById(user.getId());
    }

}
