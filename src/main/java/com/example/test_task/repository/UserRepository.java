package com.example.test_task.repository;

import com.example.test_task.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByAgeAfter(int age);

    @Query(value = "SELECT u FROM User u JOIN u.articles as a" +
            " WHERE a.color = :color")
    List<User> findByColor(String color);

    @Query(value = "SELECT u FROM User u WHERE u.articles.size = :number")
    List<User> findByArticlesNumber(int number);
}
