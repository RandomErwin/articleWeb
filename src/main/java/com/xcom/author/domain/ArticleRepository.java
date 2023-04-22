package com.xcom.author.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    Article findArticleById(Long id);
    void deleteArticleById(Long id);
}
