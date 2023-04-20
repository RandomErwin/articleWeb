package com.xcom.author.service;

import com.xcom.author.domain.Topic;

import java.util.List;

public interface TopicService {

    Topic saveTopic(Topic topic);
    Topic updateTopic(Topic topic);
    Topic findTopic(Long id);
    void deleteTopic(Long id);

    Topic includeArticle(Long topicId, Long articleId);
    Topic unincludeArticle(Long topicID, Long articleId);

}
