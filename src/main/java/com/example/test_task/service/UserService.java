package com.example.test_task.service;

import com.example.test_task.model.User;
import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAllByAgeBigger(int age);

    List<User> findByColor(String color);

    List<User> findByArticlesNumber(int number);
}
