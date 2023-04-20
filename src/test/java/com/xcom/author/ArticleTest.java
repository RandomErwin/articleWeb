package com.xcom.author;

import com.xcom.author.domain.Article;
import com.xcom.author.domain.ArticleRepository;
import com.xcom.author.domain.Comment;
import com.xcom.author.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArticleTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void saveArticle(){
        Article article = new Article();
        article.setTopic("chip war");
        article.setContent("chip war that combine A with B");
        articleService.saveArticle(article);
    }

    @Test
    public void updateArticle(){
        Article article = new Article();
        article.setTopic("Artis theory");
        article.setContent("something amazing picture");
        Comment comment1 = new Comment();
        comment1.setContent("This is an nice book");
        article.addComment(comment1);
        articleService.updateArticle(article);
    }
}
