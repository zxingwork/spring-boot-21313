package org.zx.springboot21313.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUserById(String Id){
        System.out.println("get...");
        return "user";
    }
    public void deleteUserById(String Id){
        System.out.println("delete...");
    }
}
