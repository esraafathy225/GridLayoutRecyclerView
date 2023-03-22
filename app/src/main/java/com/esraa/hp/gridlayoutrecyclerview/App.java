package com.esraa.hp.gridlayoutrecyclerview;

/**
 * Created by HP on 2018-11-24.
 */

public class App {
    private String appname;
    private int imgId;

    public App(String appname,int imgId){
        this.appname=appname;
        this.imgId=imgId;
    }

    public int getImgId() {
        return imgId;
    }

    public String getAppname() {
        return appname;
    }
}
