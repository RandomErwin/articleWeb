package com.xcom.author.service;

import com.xcom.author.domain.Article;
import com.xcom.author.domain.ArticleRepository;
import com.xcom.author.domain.Topic;
import com.xcom.author.domain.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.springframework.data.repository.init.ResourceReader.Type.JSON;


@Service
public class TopicServiceImpl implements TopicService{

    @Autowired
    private TopicRepository topicRepository;
    @Autowired
    private ArticleRepository articleRepository;

    @Transactional
    @Override
    public Topic saveTopic(Topic topic){
        return topicRepository.save(topic);
    }

    @Transactional
    @Override
    public Topic updateTopic(Topic topic){
        return topicRepository.save(topic);
    }

    @Transactional
    @Override
    public Topic findTopic(Long id){
        Topic topic = topicRepository.findTopicById(id);
        return topic;
    }

    @Transactional
    @Override
    public void deleteTopic(Long id){
        topicRepository.deleteTopicById(id);
    }


    @Transactional
    @Override
    public Topic includeArticle(Long topicId, Long articleId){
        Topic topic = topicRepository.findTopicById(topicId);
        Article article = articleRepository.findArticleById(articleId);
        topic.getArticles().add(article);
        return topic;
    }
    @Transactional
    @Override
    public Topic unincludeArticle(Long topicId, Long articleId){
        Topic topic = topicRepository.findTopicById(topicId);
        Article article = articleRepository.findArticleById(articleId);
        topic.getArticles().remove(article);
        return topic;
    }

}
