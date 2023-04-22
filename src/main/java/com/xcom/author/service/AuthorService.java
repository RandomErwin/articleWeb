package com.xcom.author.service;
import com.xcom.author.domain.Author;

import java.util.List;

public interface AuthorService {

    Author updateAuthor();
    Author saveAuthor(Author author);
    Author updateAuthor(Author author);
    Author findAuthor(Long id);
    void deleteAuthor(Long id);

}
