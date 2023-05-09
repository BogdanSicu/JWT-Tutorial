package com.munte.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Data
public class MyUser {
    private String name;
    private String password;
}
