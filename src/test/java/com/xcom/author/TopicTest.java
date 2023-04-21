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
        topic.setName("Artis");
        topicService.saveTopic(topic);
    }

    @Test
    public void updateTopic(){
        Topic topic = new Topic();
        topic.setName("Semiconductor");
        topicService.updateTopic(topic);
    }

    @Test
    public void includeArticle(){
        topicService.includeArticle(1L,1L);
    }

}
