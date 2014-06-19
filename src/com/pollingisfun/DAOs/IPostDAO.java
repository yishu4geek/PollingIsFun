package com.pollingisfun.DAOs;

import com.pollingisfun.entities.Post;

/**
 * Created by jiachen on 6/9/14.
 */
public interface IPostDAO {
    public Post createPost(Post post);
    public Post updatePost(Post post,Post newpost);
}
