package com.pollingisfun.DAOs;

import com.pollingisfun.entities.Post;
import com.pollingisfun.entities.User;

import java.util.List;

/**
 * Created by jiachen on 6/9/14.
 */
public interface IUserDAO {
    /**
     * Create user
     *
     * @param user
     * @return
     */
    public User createUser(User user);

    /**
     * Add new post to the User
     * @param user
     * @param posts
     * @return the User with the new post added
     */
    public User addPostToUser(User user, Post post);

    /**
     * Update the user with the info from newInfoUser
     * @param user
     * @return
     */
    public User updateUser(User user, User newInfoUser);
    public User findUserByID(long id);
    public List<User> findUsersByName(String username);
}
