package com.xcom.author.service;
import com.xcom.author.domain.Author;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AuthorService {

    Author updateAuthor();
    Author saveAuthor(Author author);
    Author updateAuthor(Author author);
    Author findAuthor(Long id);
    @Transactional
    void deleteAuthor(Long id);

}
