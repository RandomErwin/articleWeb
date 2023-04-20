package com.xcom.author.service;

import com.xcom.author.domain.Comment;
import com.xcom.author.domain.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }
    @Override
    public void deleteComment(Long id){
        commentRepository.deleteById(id);
    }
}
