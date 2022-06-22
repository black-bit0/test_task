package com.example.test_task.controller;

import com.example.test_task.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/by-age")
    public void findAllByAgeAfter(@RequestParam int age) {
        System.out.println(userService.findAllByAgeBigger(age));
    }

    @GetMapping("/by-color")
    public void findAllByColor(@RequestParam String color) {
        System.out.println(userService.findByColor(color.toUpperCase()));
    }

    @GetMapping("/by-number")
    public void findByArticlesNumber(@RequestParam int number) {
        System.out.println(userService.findByArticlesNumber(number));
    }
}
