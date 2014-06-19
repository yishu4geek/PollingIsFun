package com.pollingisfun.entities;

import java.util.Date;

/**
 * Created by jiachen on 6/9/14.
 */
public class Post extends BaseEntity {
    private long id;
    private long userId;
    private String subject;
    private String photoURL;
    private String content;
    private Date date;

    public Post() {
        super();
    }

    public Post(long id, long userId, String subject, String photoURL, String content) {
        super();

        put("id",id);
        put("userId",userId);
        put("subject",subject);
        put("photoURL",photoURL);
        put("content",content);
        this.id = id;
        this.userId = userId;
        this.subject = subject;
        this.photoURL = photoURL;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
