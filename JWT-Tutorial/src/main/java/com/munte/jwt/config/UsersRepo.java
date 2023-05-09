package com.munte.jwt.config;

import com.munte.jwt.model.MyUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersRepo {

    public List<MyUser> getAllUsers() {
        return new ArrayList<MyUser>() {
            {
                add(new MyUser("user1", "1234"));
                add(new MyUser("user2", "12345"));
            }
        };
    }

}
