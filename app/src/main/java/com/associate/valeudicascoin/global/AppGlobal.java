package com.associate.valeudicascoin.global;

import android.app.Application;

public class AppGlobal extends Application {

    private static AppGlobal INSTANCE = new AppGlobal();
    private String UrlApi = "";
    private String EndPointBD = "";
    private String UserBD = "";
    private String PassWBD = "";

    private AppGlobal(){}

    public static AppGlobal getInstance(){
        return INSTANCE;
    }

    public String getUrlApi() {
        return UrlApi;
    }

    public void setUrlApi(String urlApi) {
        UrlApi = urlApi;
    }

    public String getEndPointBD() {
        return EndPointBD;
    }

    public void setEndPointBD(String endPointBD) {
        EndPointBD = endPointBD;
    }

    public String getUserBD() {
        return UserBD;
    }

    public void setUserBD(String userBD) {
        UserBD = userBD;
    }

    public String getPassWBD() {
        return PassWBD;
    }

    public void setPassWBD(String passWBD) {
        PassWBD = passWBD;
    }
}
