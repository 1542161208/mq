package com.wondertek.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author: lx
 * @description: 映射
 * @date: 2021/07/12
 */
public class Book {
    private String id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    private String author;

    private String content;

    public Book() {
    }

    public Book(String id, String name, Date createDate, String author, String content) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.author = author;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
