package org.zx.springboot21313.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zx.springboot21313.model.User;
import org.zx.springboot21313.service.UserService;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/users")
    public ModelAndView users(){
        ModelAndView mv = new ModelAndView();
        List<User> users = userService.getAllUser();
        mv.addObject("users", users);
        mv.setViewName("users");
        return mv;
    }
    @GetMapping("/findalluser")
    public Page<User> findAll(int page, int size){
        if ("null".equals(String.valueOf(page))||"null".equals(String.valueOf(size))){
            Page<User> userPage = userService.getUserByPage(new PageRequest(1, 5));
            return userPage;
        }else {
            return userService.getUserByPage(new PageRequest(page, size));
        }
    }
    @RequestMapping("/adduser")
    public User addUser(String name, int age, String email, String phone, String password, String address){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        user.setPhone(phone);
        user.setPassword(password);
        user.setAddress(address);
        userService.addUser(user);
        return user;
    }
}
