package com.yushilei.xmly4fm.entities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "SPECIAL_ENTITY".
 */
public class SpecialEntity {

    private Long specialId;
    private String title;
    private Integer columnType;
    private String subtitle;
    private String footnote;
    private String coverPath;
    private Integer contentType;
    private String nickname;
    private String smallLogo;
    private Long uid;
    private String intro;
    private String coverPathBig;
    private String personalSignature;

    public SpecialEntity() {
    }

    public SpecialEntity(Long specialId) {
        this.specialId = specialId;
    }

    public SpecialEntity(Long specialId, String title, Integer columnType, String subtitle, String footnote, String coverPath, Integer contentType, String nickname, String smallLogo, Long uid, String intro, String coverPathBig, String personalSignature) {
        this.specialId = specialId;
        this.title = title;
        this.columnType = columnType;
        this.subtitle = subtitle;
        this.footnote = footnote;
        this.coverPath = coverPath;
        this.contentType = contentType;
        this.nickname = nickname;
        this.smallLogo = smallLogo;
        this.uid = uid;
        this.intro = intro;
        this.coverPathBig = coverPathBig;
        this.personalSignature = personalSignature;
    }

    public Long getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Long specialId) {
        this.specialId = specialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getColumnType() {
        return columnType;
    }

    public void setColumnType(Integer columnType) {
        this.columnType = columnType;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getFootnote() {
        return footnote;
    }

    public void setFootnote(String footnote) {
        this.footnote = footnote;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSmallLogo() {
        return smallLogo;
    }

    public void setSmallLogo(String smallLogo) {
        this.smallLogo = smallLogo;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getCoverPathBig() {
        return coverPathBig;
    }

    public void setCoverPathBig(String coverPathBig) {
        this.coverPathBig = coverPathBig;
    }

    public String getPersonalSignature() {
        return personalSignature;
    }

    public void setPersonalSignature(String personalSignature) {
        this.personalSignature = personalSignature;
    }

}