package com.thinkgem.jeesite.modules.video_m_n.entity;

import java.io.Serializable;
import java.util.Date;

public class VideoTable implements Serializable {
	private String videoPhotoUrl;
	
    public String getVideoPhotoUrl() {
		return videoPhotoUrl;
	}

	public void setVideoPhotoUrl(String videoPhotoUrl) {
		this.videoPhotoUrl = videoPhotoUrl;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.id
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.video_name
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String videoName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.video_type
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String videoType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.video_belongto
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String videoBelongto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.video_context
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String videoContext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.video_createTime
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private Date videoCreatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.video_createUser
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String videoCreateuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String attra;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String attrb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String attrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String attrd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String attre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String attrf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private String attrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_table
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.id
     *
     * @return the value of video_table.id
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.id
     *
     * @param id the value for video_table.id
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.video_name
     *
     * @return the value of video_table.video_name
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.video_name
     *
     * @param videoName the value for video_table.video_name
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.video_type
     *
     * @return the value of video_table.video_type
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getVideoType() {
        return videoType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.video_type
     *
     * @param videoType the value for video_table.video_type
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setVideoType(String videoType) {
        this.videoType = videoType == null ? null : videoType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.video_belongto
     *
     * @return the value of video_table.video_belongto
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getVideoBelongto() {
        return videoBelongto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.video_belongto
     *
     * @param videoBelongto the value for video_table.video_belongto
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setVideoBelongto(String videoBelongto) {
        this.videoBelongto = videoBelongto == null ? null : videoBelongto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.video_context
     *
     * @return the value of video_table.video_context
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getVideoContext() {
        return videoContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.video_context
     *
     * @param videoContext the value for video_table.video_context
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setVideoContext(String videoContext) {
        this.videoContext = videoContext == null ? null : videoContext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.video_createTime
     *
     * @return the value of video_table.video_createTime
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public Date getVideoCreatetime() {
        return videoCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.video_createTime
     *
     * @param videoCreatetime the value for video_table.video_createTime
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setVideoCreatetime(Date videoCreatetime) {
        this.videoCreatetime = videoCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.video_createUser
     *
     * @return the value of video_table.video_createUser
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getVideoCreateuser() {
        return videoCreateuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.video_createUser
     *
     * @param videoCreateuser the value for video_table.video_createUser
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setVideoCreateuser(String videoCreateuser) {
        this.videoCreateuser = videoCreateuser == null ? null : videoCreateuser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.ATTRA
     *
     * @return the value of video_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getAttra() {
        return attra;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.ATTRA
     *
     * @param attra the value for video_table.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setAttra(String attra) {
        this.attra = attra == null ? null : attra.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.ATTRB
     *
     * @return the value of video_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getAttrb() {
        return attrb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.ATTRB
     *
     * @param attrb the value for video_table.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setAttrb(String attrb) {
        this.attrb = attrb == null ? null : attrb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.ATTRC
     *
     * @return the value of video_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getAttrc() {
        return attrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.ATTRC
     *
     * @param attrc the value for video_table.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setAttrc(String attrc) {
        this.attrc = attrc == null ? null : attrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.ATTRD
     *
     * @return the value of video_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getAttrd() {
        return attrd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.ATTRD
     *
     * @param attrd the value for video_table.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setAttrd(String attrd) {
        this.attrd = attrd == null ? null : attrd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.ATTRE
     *
     * @return the value of video_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getAttre() {
        return attre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.ATTRE
     *
     * @param attre the value for video_table.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setAttre(String attre) {
        this.attre = attre == null ? null : attre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.ATTRF
     *
     * @return the value of video_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getAttrf() {
        return attrf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.ATTRF
     *
     * @param attrf the value for video_table.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setAttrf(String attrf) {
        this.attrf = attrf == null ? null : attrf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table.ATTRG
     *
     * @return the value of video_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public String getAttrg() {
        return attrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table.ATTRG
     *
     * @param attrg the value for video_table.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:26 CST 2016
     */
    public void setAttrg(String attrg) {
        this.attrg = attrg == null ? null : attrg.trim();
    }
}