package com.example.test_task.controller;

import com.example.test_task.model.Article;
import com.example.test_task.model.Color;
import com.example.test_task.model.Names;
import com.example.test_task.model.User;
import com.example.test_task.service.ArticleService;
import com.example.test_task.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/inject")
public class IndexController {
    private final UserService userService;
    private final ArticleService articleService;

    public IndexController(UserService userService, ArticleService articleService) {
        this.userService = userService;
        this.articleService = articleService;
    }

    @GetMapping("/inject-all")
    public void injectArticle() {
        Article article1 = new Article();
        article1.setText("someText1");
        article1.setColor(Color.BLUE.name());
        articleService.save(article1);

        Article article2 = new Article();
        article2.setText("someText2");
        article2.setColor(Color.GREEN.name());
        articleService.save(article2);

        Article article3 = new Article();
        article3.setText("someText3");
        article3.setColor(Color.RED.name());
        articleService.save(article3);

        Article article4 = new Article();
        article4.setText("someText4");
        article4.setColor(Color.BLUE.name());
        articleService.save(article4);

        Article article5 = new Article();
        article5.setText("someText5");
        article5.setColor(Color.GREEN.name());
        articleService.save(article5);

        Article article6 = new Article();
        article6.setText("someText6");
        article6.setColor(Color.RED.name());
        articleService.save(article6);

        Article article7 = new Article();
        article7.setText("someText7");
        article7.setColor(Color.BLUE.name());
        articleService.save(article7);

        Article article8 = new Article();
        article8.setText("someText");
        article8.setColor(Color.GREEN.name());
        articleService.save(article8);

        Article article9 = new Article();
        article9.setText("someText");
        article9.setColor(Color.RED.name());
        articleService.save(article9);

        User user1 = new User();
        user1.setName(String.valueOf(Names.BOB));
        user1.setAge(18);
        user1.setArticles(List.of(articleService.findById(1).get(), articleService.findById(2).get(),
                articleService.findById(3).get()));
        userService.save(user1);

        User user2 = new User();
        user2.setName(String.valueOf(Names.CATRINE));
        user2.setAge(22);
        user2.setArticles(List.of(articleService.findById(4).get(), articleService.findById(5).get(),
                articleService.findById(6).get()));
        userService.save(user2);

        User user3 = new User();
        user3.setName(String.valueOf(Names.JON));
        user3.setAge(19);
        user3.setArticles(List.of(articleService.findById(7).get()));
        userService.save(user3);

        User user4 = new User();
        user4.setName(String.valueOf(Names.BOB));
        user4.setAge(31);
        user4.setArticles(List.of(articleService.findById(8).get()));
        userService.save(user4);

        User user5 = new User();
        user5.setName(String.valueOf(Names.SAM));
        user5.setAge(33);
        user5.setArticles(List.of(articleService.findById(9).get()));
        userService.save(user5);
    }
}
