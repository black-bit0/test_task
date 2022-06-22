package com.example.test_task.service.impl;

import com.example.test_task.model.Article;
import com.example.test_task.repository.ArticleRepository;
import com.example.test_task.service.ArticleService;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repository;

    public ArticleServiceImpl(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Article save(Article article) {
        return repository.save(article);
    }

    @Override
    public Optional<Article> findById(long id) {
        return repository.findById(id);
    }
}
