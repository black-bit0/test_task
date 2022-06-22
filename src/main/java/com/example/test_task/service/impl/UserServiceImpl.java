package com.example.test_task.service.impl;

import com.example.test_task.model.User;
import com.example.test_task.repository.UserRepository;
import com.example.test_task.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> findAllByAgeBigger(int age) {
        return repository.findAllByAgeAfter(age);
    }


    @Override
    public List<User> findByColor(String color) {
        return repository.findByColor(color);
    }

    @Override
    public List<User> findByArticlesNumber(int number) {
        return repository.findByArticlesNumber(number);
    }
}
