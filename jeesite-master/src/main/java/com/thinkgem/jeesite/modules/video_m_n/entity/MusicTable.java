package com.thinkgem.jeesite.modules.video_m_n.entity;

import java.io.Serializable;
import java.util.Date;

public class MusicTable implements Serializable {
	private String musicPhotoUrl;
    public String getMusicPhotoUrl() {
		return musicPhotoUrl;
	}

	public void setMusicPhotoUrl(String musicPhotoUrl) {
		this.musicPhotoUrl = musicPhotoUrl;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.music_name
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String musicName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.music_type
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String musicType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.music_belongTo
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String musicBelongto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.music_context
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String musicContext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.music_createTime
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private Date musicCreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.music_createUser
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String musicCreateuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attra;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column music_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table music_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.id
     *
     * @return the value of music_table.id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.id
     *
     * @param id the value for music_table.id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.music_name
     *
     * @return the value of music_table.music_name
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getMusicName() {
        return musicName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.music_name
     *
     * @param musicName the value for music_table.music_name
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.music_type
     *
     * @return the value of music_table.music_type
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getMusicType() {
        return musicType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.music_type
     *
     * @param musicType the value for music_table.music_type
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setMusicType(String musicType) {
        this.musicType = musicType == null ? null : musicType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.music_belongTo
     *
     * @return the value of music_table.music_belongTo
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getMusicBelongto() {
        return musicBelongto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.music_belongTo
     *
     * @param musicBelongto the value for music_table.music_belongTo
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setMusicBelongto(String musicBelongto) {
        this.musicBelongto = musicBelongto == null ? null : musicBelongto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.music_context
     *
     * @return the value of music_table.music_context
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getMusicContext() {
        return musicContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.music_context
     *
     * @param musicContext the value for music_table.music_context
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setMusicContext(String musicContext) {
        this.musicContext = musicContext == null ? null : musicContext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.music_createTime
     *
     * @return the value of music_table.music_createTime
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public Date getMusicCreatetime() {
        return musicCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.music_createTime
     *
     * @param musicCreatetime the value for music_table.music_createTime
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setMusicCreatetime(Date musicCreatetime) {
        this.musicCreatetime = musicCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.music_createUser
     *
     * @return the value of music_table.music_createUser
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getMusicCreateuser() {
        return musicCreateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.music_createUser
     *
     * @param musicCreateuser the value for music_table.music_createUser
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setMusicCreateuser(String musicCreateuser) {
        this.musicCreateuser = musicCreateuser == null ? null : musicCreateuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.ATTRA
     *
     * @return the value of music_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttra() {
        return attra;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.ATTRA
     *
     * @param attra the value for music_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttra(String attra) {
        this.attra = attra == null ? null : attra.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.ATTRB
     *
     * @return the value of music_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrb() {
        return attrb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.ATTRB
     *
     * @param attrb the value for music_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrb(String attrb) {
        this.attrb = attrb == null ? null : attrb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.ATTRC
     *
     * @return the value of music_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrc() {
        return attrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.ATTRC
     *
     * @param attrc the value for music_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrc(String attrc) {
        this.attrc = attrc == null ? null : attrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.ATTRD
     *
     * @return the value of music_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrd() {
        return attrd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.ATTRD
     *
     * @param attrd the value for music_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrd(String attrd) {
        this.attrd = attrd == null ? null : attrd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.ATTRE
     *
     * @return the value of music_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttre() {
        return attre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.ATTRE
     *
     * @param attre the value for music_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttre(String attre) {
        this.attre = attre == null ? null : attre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.ATTRF
     *
     * @return the value of music_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrf() {
        return attrf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.ATTRF
     *
     * @param attrf the value for music_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrf(String attrf) {
        this.attrf = attrf == null ? null : attrf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column music_table.ATTRG
     *
     * @return the value of music_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrg() {
        return attrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column music_table.ATTRG
     *
     * @param attrg the value for music_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrg(String attrg) {
        this.attrg = attrg == null ? null : attrg.trim();
    }
}