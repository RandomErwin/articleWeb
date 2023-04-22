package com.xcom.author;

import com.xcom.author.domain.Article;
import com.xcom.author.domain.Topic;
import com.xcom.author.domain.TopicRepository;
import com.xcom.author.service.ArticleService;
import com.xcom.author.service.TopicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class TopicTest {

    @Autowired
    private TopicService topicService;
    @Autowired
    private ArticleService articleService;

    @Test
    public void saveTopic(){
        Topic topic = new Topic();
        topic.setName("Semiconductor");
        topicService.saveTopic(topic);
    }

    @Test
    public void updateTopic(){
        Topic topic = topicService.findTopic(302L);
        topic.setName("philosophy");
        topicService.saveTopic(topic);
    }

    @Test
    public void deleteTopic(){
        topicService.deleteTopic(252L);
    }

    @Test
    public void includeArticle(){
        topicService.includeArticle(2L,2L);
    }

    @Test
    public void unincludeArticle(){
        topicService.unincludeArticle(1L,1L);
    }

}
