package com.example.demo.model;

import java.io.Serializable;

/**
 * Created by wang on 2017/8/18.
 */

public class DemoInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    private long id;

    private String name;

    private String pwd;

    public long getId() {

        return id;

    }

    public void setId(long id) {

        this.id = id;

    }


    public void setName(String name) {

        this.name = name;

    }

    public String getPwd(){

        return pwd;

    }

    public void setPwd(String pwd) {

        this.pwd = pwd;

    }

}
