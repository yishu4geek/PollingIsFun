package com.pollingisfun.entities;

import java.util.Date;
import java.util.List;

/**
 * Created by jiachen on 6/9/14.
 */
public class User extends BaseEntity{

    private long id;
    private String name;
    public List<Post> postsList;
    public User(){
        super();
    }

    public User(long id) {
        super();
        put("id",id);
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public User(long id, String name, List<Post> postsList) {
        super();
        put("id",id);
        put("name",name);
        put("postslist",postsList);
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPostsList() {
        return postsList;
    }

    public void setPostsList(List<Post> postsList) {
        this.postsList = postsList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postsList=" + postsList +
                ", date=" + date +
                '}';
    }
}
