package org.zx.springboot21313.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.zx.springboot21313.dao.UserDao;
import org.zx.springboot21313.model.User;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public void addUser(User user){
        userDao.save(user);
    }
    public Page<User> getUserByPage(Pageable pageable){
        return userDao.findAll(pageable);
    }
    public List<User> getUsersById(Integer id){
        return userDao.getUserById(id);
    }
    public List<User> getUsersByName(String name){
        return userDao.getUsersByName(name);
    }
    public List<User> getAllUser(){
        return userDao.findAll();
    }
}
