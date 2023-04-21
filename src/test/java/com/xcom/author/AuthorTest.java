package com.xcom.author;

import com.xcom.author.domain.Author;
import com.xcom.author.domain.AuthorRepository;
import com.xcom.author.service.AuthorService;
import com.xcom.author.service.AuthorServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class AuthorTest {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorService authorService;

    @Test
    public void saveAuthorTest(){
        Author author = new Author();
        author.setNickName("Nick");
        author.setPhoneNum(("0984"));
        author.setSigndate(new Date());

        authorRepository.save(author);
    }

    @Test
    public void updateAuthor(){
        Author author = new Author();
        author.setNickName("Boshe");
        author.setPhoneNum(("0931"));
        author.setSigndate(new Date());

        authorService.updateAuthor(author);
    }

    @Test
    public void upadateAuthor(){
        Author author = new Author();
        author.setNickName("Ryan");
        author.setPhoneNum("0986");
        author.setSigndate(new Date());

        authorService.updateAuthor(author);
    }

}