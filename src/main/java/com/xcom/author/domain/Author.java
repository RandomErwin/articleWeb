package com.xcom.author.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nickName;
    @Column
    private String phoneNum;
    @Column
    private Date signdate;

    public Author() {
    }

    public Author(Long id, String nickName, String phoneNum, Date signdate) {
        this.id = id;
        this.nickName = nickName;
        this.phoneNum = phoneNum;
        this.signdate = signdate;
    }

    public Author(String nickName, String phoneNum, Date signdate) {
        this.nickName = nickName;
        this.phoneNum = phoneNum;
        this.signdate = signdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getSigndate() {
        return signdate;
    }

    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }
}
