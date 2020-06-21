package com.search.entity;

import java.util.Date;

public class BookDetail {
    private Integer id;

    private Integer bookChapterId;

    private String bookChapterName;

    private Integer bookId;

    private Date gmtCreate;

    private Date gmtModified;

    private String bookChapterContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookChapterId() {
        return bookChapterId;
    }

    public void setBookChapterId(Integer bookChapterId) {
        this.bookChapterId = bookChapterId;
    }

    public String getBookChapterName() {
        return bookChapterName;
    }

    public void setBookChapterName(String bookChapterName) {
        this.bookChapterName = bookChapterName == null ? null : bookChapterName.trim();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getBookChapterContent() {
        return bookChapterContent;
    }

    public void setBookChapterContent(String bookChapterContent) {
        this.bookChapterContent = bookChapterContent == null ? null : bookChapterContent.trim();
    }
}