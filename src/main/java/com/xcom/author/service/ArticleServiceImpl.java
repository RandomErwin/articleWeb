package com.xcom.author.service;

import com.xcom.author.domain.Article;
import com.xcom.author.domain.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article saveArticle(Article article){
        return articleRepository.save(article);
    }
    @Override
    public Article updateArticle(Article article){
        return articleRepository.save(article);
    }
    @Override
    public Article findArticle(Long id) {
        return articleRepository.findArticleById(id);
    }

    @Transactional
    @Override
    public void deleteArticle(Long id){
        articleRepository.deleteArticleById(id);
    }
}
