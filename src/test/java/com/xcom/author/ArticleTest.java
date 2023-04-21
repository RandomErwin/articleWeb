package com.xcom.author;

import com.xcom.author.domain.Article;
import com.xcom.author.domain.ArticleRepository;
import com.xcom.author.domain.Comment;
import com.xcom.author.service.ArticleService;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class ArticleTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void saveArticle(){
        Article article = new Article();
        article.setTopic("優雅的宇宙");
        article.setContent("String theory");
        articleService.saveArticle(article);
    }

    @Test
    public void updateArticle(){
        Article article = new Article();
        article.setTopic("Artis theory");
        article.setContent("something amazing picture");
        Comment comment1 = new Comment();
        comment1.setContent("Nice book");
        article.addComment(comment1);
        articleService.updateArticle(article);
    }

    @Test
    public void findArticle(){
        Article article = articleService.findArticle(1L);
        System.out.println(article);
    }

    @Transactional
    @Test
    public void deleteArticle(){
        articleService.deleteArticle(52L);
    }
}
