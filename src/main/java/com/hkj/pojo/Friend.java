package com.hkj.pojo;

public class Friend {
    private Integer fri_id;

    private Integer fri_s_id1;

    private Integer fri_s_id2;

    private String fri_url;

    public Integer getFri_id() {
        return fri_id;
    }

    public void setFri_id(Integer fri_id) {
        this.fri_id = fri_id;
    }

    public Integer getFri_s_id1() {
        return fri_s_id1;
    }

    public void setFri_s_id1(Integer fri_s_id1) {
        this.fri_s_id1 = fri_s_id1;
    }

    public Integer getFri_s_id2() {
        return fri_s_id2;
    }

    public void setFri_s_id2(Integer fri_s_id2) {
        this.fri_s_id2 = fri_s_id2;
    }

    public String getFri_url() {
        return fri_url;
    }

    public void setFri_url(String fri_url) {
        this.fri_url = fri_url == null ? null : fri_url.trim();
    }
}