package com.xcom.author;

import com.xcom.author.domain.Article;
import com.xcom.author.domain.ArticleRepository;
import com.xcom.author.domain.Comment;
import com.xcom.author.service.ArticleService;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class ArticleTest {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ArticleRepository articleRepository;


    @Transactional
    @Test
    public void saveArticle(){
        Article article = new Article();
        article.setTitle("優雅的宇宙");
        article.setContent("String theory");
        articleService.saveArticle(article);
    }

    @Test
    public void updateArticle(){
        Article article = articleService.findArticle(102L);
        article.setTitle("國家為什麼會失敗");
        article.setContent("闡述廣納型與搾取型制度導致的經濟結果");

        Comment comment1 = new Comment();
        comment1.setContent("值得參考的一本書");
        article.addComment(comment1);
        articleService.updateArticle(article);
    }

    @Test
    public void findArticle(){
        Article article = articleService.findArticle(1L);
        System.out.println(article);
    }


    @Test
    @Transactional
    public void deleteArticle(){
        articleService.deleteArticle(2L);
    }
}
