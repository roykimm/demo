package com.example.demo.domain;

public class UserVO {
    String USER_ID;
    String USER_KOR_NAME;
    String USER_ENG_NAME;
    String USER_EMAIL;
    String USER_PHONE;

    public String getUserId() {
        return USER_ID;
    }
    public String getUserKorName() {
        return USER_KOR_NAME;
    }
    public String getUserEngName() {
        return USER_ENG_NAME;
    }
    public String getUserEmail() {
        return USER_EMAIL;
    }
    public String getUserPhone() {
        return USER_PHONE;
    }

    public void setUserId(String USER_ID) {
        this.USER_ID = USER_ID;
    }
    public void setUserKorName(String USER_KOR_NAME) {
        this.USER_KOR_NAME = USER_KOR_NAME;
    }
    public void setUserEngName(String USER_ENG_NAME) {
        this.USER_ENG_NAME = USER_ENG_NAME;
    }
    public void setUserEmail(String USER_EMAIL) {
        this.USER_EMAIL = USER_EMAIL;
    }
    public void setUserPhone(String USER_PHONE) {
        this.USER_PHONE = USER_PHONE;
    }
}