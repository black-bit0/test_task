package com.example.test_task.service;

import com.example.test_task.model.Article;
import java.util.Optional;

public interface ArticleService {
    Article save(Article article);

    Optional<Article> findById(long id);
}
