package com.pollingisfun.dbUtils;

import com.mongodb.DB;

import java.net.UnknownHostException;

/**
 * Created by jiachen on 6/9/14.
 */
public interface IDbUtils {

    public DB getDBInstance() throws UnknownHostException;;
}
