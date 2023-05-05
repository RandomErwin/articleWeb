package com.xcom.author;

import com.xcom.author.domain.Author;
import com.xcom.author.domain.AuthorRepository;
import com.xcom.author.service.AuthorService;
import com.xcom.author.service.AuthorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class AuthorTest {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorService authorService;

    @Test
    public void saveAuthorTest(){
        Author author = new Author();
        author.setNickName("Jonson");
        author.setPhoneNum(("0926"));
        author.setSigndate(new Date());

        authorRepository.save(author);
    }

    @Test
    public void updateAuthor(){
        Author author = authorService.findAuthor(1L);
        author.setNickName("Boshe");
        author.setPhoneNum(("0931"));
        author.setSigndate(new Date());

        authorService.updateAuthor(author);
    }

    @Transactional
    @Test
    public void deleteAuthor(){
        authorService.deleteAuthor(52L);
    }

}
