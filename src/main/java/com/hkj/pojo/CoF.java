package com.hkj.pojo;

public class CoF {
    private Integer cof_id;

    private Integer cof_s_id;

    private String cof_text;

    private String cof_photo;

    private String cof_video;

    public Integer getCof_id() {
        return cof_id;
    }

    public void setCof_id(Integer cof_id) {
        this.cof_id = cof_id;
    }

    public Integer getCof_s_id() {
        return cof_s_id;
    }

    public void setCof_s_id(Integer cof_s_id) {
        this.cof_s_id = cof_s_id;
    }

    public String getCof_text() {
        return cof_text;
    }

    public void setCof_text(String cof_text) {
        this.cof_text = cof_text == null ? null : cof_text.trim();
    }

    public String getCof_photo() {
        return cof_photo;
    }

    public void setCof_photo(String cof_photo) {
        this.cof_photo = cof_photo == null ? null : cof_photo.trim();
    }

    public String getCof_video() {
        return cof_video;
    }

    public void setCof_video(String cof_video) {
        this.cof_video = cof_video == null ? null : cof_video.trim();
    }
}