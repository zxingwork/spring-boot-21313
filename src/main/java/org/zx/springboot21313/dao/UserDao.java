package org.zx.springboot21313.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zx.springboot21313.model.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    List<User> getUserById(Integer id);
    List<User> getUsersByName(String name);
    List<User> getUsersByAgeGreaterThan(Integer age);
}
