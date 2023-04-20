package com.xcom.author.service;

import com.xcom.author.domain.Article;

import java.util.List;

public interface ArticleService {

    Article saveArticle(Article article);

    Article updateArticle(Article article);

    Article findArticle(Long id);

    void deleteArticle(Long id);
}
