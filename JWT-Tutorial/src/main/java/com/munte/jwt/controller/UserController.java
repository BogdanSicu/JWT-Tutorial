package com.munte.jwt.controller;

import com.munte.jwt.model.JwtRequest;
import com.munte.jwt.model.JwtResponse;
import com.munte.jwt.model.MyUser;
import com.munte.jwt.service.UserService;
import com.munte.jwt.utility.JWTUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {


    private final JWTUtility jwtUtility;
    private final UserService userService;

    @Autowired
    public UserController(JWTUtility jwtUtility, UserService userService) {
        this.jwtUtility = jwtUtility;
        this.userService = userService;
    }

    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) {
        MyUser user = null;
        try {
            user = userService.getAllUser().stream().filter(x ->
                    x.getName().equals(jwtRequest.getUsername()) &&
                            x.getPassword().equals(jwtRequest.getPassword())).toList().get(0);



            if(user != null) {
                String token = jwtUtility.generateToken(user);
                System.out.println(user);
                return new JwtResponse(token);
            }
            return new JwtResponse("Wrong credentials");

        } catch (Exception e) {
            return new JwtResponse("Wrong credentials");
        }



    }

}
