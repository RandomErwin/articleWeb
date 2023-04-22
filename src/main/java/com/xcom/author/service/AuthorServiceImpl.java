package com.xcom.author.service;

import com.xcom.author.domain.Author;
import com.xcom.author.domain.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author updateAuthor() {
        return null;
    }

    @Override
    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author){
        return authorRepository.save(author);
    }

    @Override
    public Author findAuthor(Long id){
        return authorRepository.findAuthorById(id);
    }

    @Override
    public void deleteAuthor(Long id){
        authorRepository.deleteAuthorById(id);
    }


}
