package com.pollingisfun.dbUtils;
import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;
import java.util.Set;

/**
 * Created by jiachen on 6/9/14.
 */
public class DbUtils implements IDbUtils
{
    DB db=null;
    @Override
    public  DB getDBInstance() throws UnknownHostException {
       if(db == null)
       {
           MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
           db = mongoClient.getDB("pollingisfun");

       }

        return db;
    }

    public static void main(String[] args) throws UnknownHostException {
       DbUtils dbUtils = new DbUtils();
        DB db =dbUtils.getDBInstance();
        Set<String> colls = db.getCollectionNames();
        for(String s:colls){
            System.out.println(s);
        }

    }
}
