package com.xcom.author.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;

    @OneToMany(mappedBy = "article", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private List<Comment> comments = new ArrayList<>();
    @ManyToMany(mappedBy = "articles")
    private List<Topic> topics = new ArrayList<>();

    public void addComment(Comment comment){
        comment.setArticle(this);
        comments.add(comment);
    }

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
