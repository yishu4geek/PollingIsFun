package com.pollingisfun.DAOs;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.pollingisfun.dbUtils.DbUtils;
import com.pollingisfun.entities.Post;
import com.pollingisfun.entities.User;

import java.net.UnknownHostException;
import java.util.List;

/**
 * Created by jiachen on 6/9/14.
 */
public class UserDAO implements IUserDAO
{
    private final String USER_COLLECTION_NAME = "users";
    private  DbUtils dbUtils;
    private DB db;

    public UserDAO() throws UnknownHostException {
       dbUtils = new DbUtils();
        db = dbUtils.getDBInstance();
    }

    @Override
    public User createUser(User user) {

        DBCollection users = db.getCollection(USER_COLLECTION_NAME);
//        users.setObjectClass(User.class);

        users.insert(user);
        return user;
    }

    @Override
    public User addPostToUser(User user, Post posts) {
        return user;
    }

    @Override
    public User updateUser(User user, User newInfoUser) {
        return null;
    }

    @Override
    public User findUserByID(long id) {
        DBCollection dbCollection = db.getCollection(USER_COLLECTION_NAME);
        User user = new User(id);
        DBCursor dbCursor =  dbCollection.find();

        User outputuser = null;
        try{
        while(dbCursor.hasNext()){
         //   outputuser =  dbCursor.next();
        }
        }finally {
            dbCursor.close();
        }
        return outputuser;
    }

    @Override
    public List<User> findUsersByName(String username) {
        return null;
    }
}
