package com.xcom.author.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    Topic findTopicById(Long id);
    List<Topic> deleteTopicById(Long id);

}
