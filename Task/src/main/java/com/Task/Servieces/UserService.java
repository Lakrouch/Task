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

    public User createUser(String name, String secondname, String email, String role, String mobile){

        User user = new User(name, secondname, email, role, mobile);

        return user;
    }

    public User updateUser(User user, String name, String secondname, String email, String role, String mobile) {
        System.out.println(user.getId()+","+user.getName()+","+user.getSecondName()+","+user.getEmail()+","+user.getRole()+","+user.getMobile());
        if(!name.equals("")){
            user.setName(name);
        }
        if(!secondname.equals("")){
            user.setSecondName(secondname);
        }
        if(!email.equals("")){
            user.setEmail(email);
        }
        if(!role.equals("")){
            user.setRole(role);
        }
        if(!mobile.equals("")){
            user.setMobile(mobile);
        }
        System.out.println(user.getId()+","+user.getName()+","+user.getSecondName()+","+user.getEmail()+","+user.getRole()+","+user.getMobile());
        return user;
    }
}
