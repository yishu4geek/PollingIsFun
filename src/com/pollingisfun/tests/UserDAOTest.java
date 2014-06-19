package com.pollingisfun.tests;

import com.pollingisfun.DAOs.UserDAO;
import com.pollingisfun.entities.Post;
import com.pollingisfun.entities.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jiachen on 6/9/14.
 */
public class UserDAOTest {

    User user;

    @Before
    public void init() {

        Post post = new Post(1, 1, "hello jk", "www.google.com", "Hey, Jk how are you doing");
        List<Post> postList = new ArrayList<Post>();

        postList.add(post);
        user = new User(1, "jk",postList);
        //user.setPostsList(postList);
    }

    @Test
    public void testCreateUser() throws Exception {
        UserDAO userDAO = new UserDAO();


        userDAO.createUser(user);
    }

    @Test
    public void testFindUserByID() throws Exception {
        UserDAO userDAO = new UserDAO();
        User finduser = userDAO.findUserByID(1);
        if (finduser != null) {
            System.out.println(user.toString());
        }else{
            System.out.println("User is null");
        }

    }

    @Test
    public void testDate(){
        Date date = new Date();
        System.out.println(date);
    }
}
