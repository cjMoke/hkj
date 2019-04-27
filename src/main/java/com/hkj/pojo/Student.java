package com.hkj.pojo;

public class Student {
    private Integer s_id;

    private String s_name;

    private String s_password;

    private String s_email;

    private String s_photo;

    private String s_autograph;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name == null ? null : s_name.trim();
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password == null ? null : s_password.trim();
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email == null ? null : s_email.trim();
    }

    public String getS_photo() {
        return s_photo;
    }

    public void setS_photo(String s_photo) {
        this.s_photo = s_photo == null ? null : s_photo.trim();
    }

    public String getS_autograph() {
        return s_autograph;
    }

    public void setS_autograph(String s_autograph) {
        this.s_autograph = s_autograph == null ? null : s_autograph.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_password='" + s_password + '\'' +
                ", s_email='" + s_email + '\'' +
                ", s_photo='" + s_photo + '\'' +
                ", s_autograph='" + s_autograph + '\'' +
                '}';
    }
}