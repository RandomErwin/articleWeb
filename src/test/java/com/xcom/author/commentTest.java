package com.xcom.author;

import com.xcom.author.domain.Article;
import com.xcom.author.domain.AuthorRepository;
import com.xcom.author.domain.Comment;
import com.xcom.author.domain.CommentRepository;
import com.xcom.author.service.ArticleService;
import com.xcom.author.service.AuthorService;
import com.xcom.author.service.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class commentTest {

    @Autowired
    private CommentService commentService;
    @Autowired
    private ArticleService articleService;
    @Test
    public void saveCommentTest(){
        Article article = articleService.findArticle(2L);

        Comment comment = new Comment();
        comment.setContent("The best book you should read");
        comment.setArticle(article);

        commentService.saveComment(comment);
    }


}
