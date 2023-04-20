package com.xcom.author.service;

import com.xcom.author.domain.Comment;

public interface CommentService {

    Comment saveComment(Comment comment);
    void deleteComment(Long id);
}
