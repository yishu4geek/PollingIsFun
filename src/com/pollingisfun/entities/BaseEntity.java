package com.pollingisfun.entities;

import com.mongodb.BasicDBObject;

import java.util.Date;

/**
 * Created by jiachen on 6/9/14.
 */
public abstract class BaseEntity extends BasicDBObject {

    private Date timeStamp = new Date();

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
