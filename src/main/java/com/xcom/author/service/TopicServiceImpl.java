package com.xcom.author.service;

import com.xcom.author.domain.Article;
import com.xcom.author.domain.ArticleRepository;
import com.xcom.author.domain.Topic;
import com.xcom.author.domain.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicServiceImpl implements TopicService{

    @Autowired
    private TopicRepository topicRepository;
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Topic saveTopic(Topic topic){
        return topicRepository.save(topic);
    }
    @Override
    public Topic updateTopic(Topic topic){
        return topicRepository.save(topic);
    }
    @Override
    public Topic findTopic(Long id){
        return topicRepository.findTopicById(id);
    }
    @Override
    public void deleteTopic(Long id){
        topicRepository.deleteTopicById(id);
    }

    @Override
    public Topic includeArticle(Long topicId, Long articleId){
        Topic topic = topicRepository.findTopicById(topicId);
        Article article = articleRepository.findArticleById(articleId);
        topic.getArticles().add(article);
        return topic;
    }
    @Override
    public Topic unincludeArticle(Long topicId, Long articleId){
        Topic topic = topicRepository.findTopicById(topicId);
        Article article = articleRepository.findArticleById(articleId);
        topic.getArticles().add(article);
        return topic;
    }

}
