package com.munte.jwt.service;

import com.munte.jwt.config.UsersRepo;
import com.munte.jwt.model.MyUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UsersRepo usersRepo;

    public UserService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public List<MyUser> getAllUser() {
        return usersRepo.getAllUsers();
    }
}
