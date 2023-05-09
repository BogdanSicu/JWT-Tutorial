package com.munte.jwt.service;

import com.munte.jwt.config.UsersRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UsersRepo usersRepo;

    public UserService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }
}
