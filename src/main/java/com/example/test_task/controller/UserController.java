package com.example.test_task.controller;

import com.example.test_task.model.User;
import com.example.test_task.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/by-age")
    public List<User> findAllByAgeAfter(@RequestParam int age) {
        return userService.findAllByAgeBigger(age);
    }

    @GetMapping("/by-color")
    public List<User> findAllByColor(@RequestParam String color) {
        return userService.findByColor(color.toUpperCase());
    }

    @GetMapping("/by-number")
    public List<User> findByArticlesNumber(@RequestParam int number) {
        return userService.findByArticlesNumber(number);
    }
}
