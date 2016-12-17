package com.thinkgem.jeesite.modules.video_m_n.entity;

import java.io.Serializable;

public class VideoTableCount implements Serializable {
	
	private String videoDownAddress;
    public String getVideoDownAddress() {
		return videoDownAddress;
	}

	public void setVideoDownAddress(String videoDownAddress) {
		this.videoDownAddress = videoDownAddress;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.video_id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private Integer videoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.video_address
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String videoAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.video_play_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private Integer videoPlayCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.video_like_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private Integer videoLikeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.video_hite_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private Integer videoHiteCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.video_order
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private Integer videoOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attra;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attre;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_table_count.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private String attrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table video_table_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.id
     *
     * @return the value of video_table_count.id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.id
     *
     * @param id the value for video_table_count.id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.video_id
     *
     * @return the value of video_table_count.video_id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.video_id
     *
     * @param videoId the value for video_table_count.video_id
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.video_address
     *
     * @return the value of video_table_count.video_address
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getVideoAddress() {
        return videoAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.video_address
     *
     * @param videoAddress the value for video_table_count.video_address
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress == null ? null : videoAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.video_play_count
     *
     * @return the value of video_table_count.video_play_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public Integer getVideoPlayCount() {
        return videoPlayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.video_play_count
     *
     * @param videoPlayCount the value for video_table_count.video_play_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setVideoPlayCount(Integer videoPlayCount) {
        this.videoPlayCount = videoPlayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.video_like_count
     *
     * @return the value of video_table_count.video_like_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public Integer getVideoLikeCount() {
        return videoLikeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.video_like_count
     *
     * @param videoLikeCount the value for video_table_count.video_like_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setVideoLikeCount(Integer videoLikeCount) {
        this.videoLikeCount = videoLikeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.video_hite_count
     *
     * @return the value of video_table_count.video_hite_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public Integer getVideoHiteCount() {
        return videoHiteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.video_hite_count
     *
     * @param videoHiteCount the value for video_table_count.video_hite_count
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setVideoHiteCount(Integer videoHiteCount) {
        this.videoHiteCount = videoHiteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.video_order
     *
     * @return the value of video_table_count.video_order
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public Integer getVideoOrder() {
        return videoOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.video_order
     *
     * @param videoOrder the value for video_table_count.video_order
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setVideoOrder(Integer videoOrder) {
        this.videoOrder = videoOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.ATTRA
     *
     * @return the value of video_table_count.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttra() {
        return attra;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.ATTRA
     *
     * @param attra the value for video_table_count.ATTRA
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttra(String attra) {
        this.attra = attra == null ? null : attra.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.ATTRB
     *
     * @return the value of video_table_count.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrb() {
        return attrb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.ATTRB
     *
     * @param attrb the value for video_table_count.ATTRB
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrb(String attrb) {
        this.attrb = attrb == null ? null : attrb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.ATTRC
     *
     * @return the value of video_table_count.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrc() {
        return attrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.ATTRC
     *
     * @param attrc the value for video_table_count.ATTRC
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrc(String attrc) {
        this.attrc = attrc == null ? null : attrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.ATTRD
     *
     * @return the value of video_table_count.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrd() {
        return attrd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.ATTRD
     *
     * @param attrd the value for video_table_count.ATTRD
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrd(String attrd) {
        this.attrd = attrd == null ? null : attrd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.ATTRE
     *
     * @return the value of video_table_count.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttre() {
        return attre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.ATTRE
     *
     * @param attre the value for video_table_count.ATTRE
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttre(String attre) {
        this.attre = attre == null ? null : attre.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.ATTRF
     *
     * @return the value of video_table_count.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrf() {
        return attrf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.ATTRF
     *
     * @param attrf the value for video_table_count.ATTRF
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrf(String attrf) {
        this.attrf = attrf == null ? null : attrf.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_table_count.ATTRG
     *
     * @return the value of video_table_count.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public String getAttrg() {
        return attrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_table_count.ATTRG
     *
     * @param attrg the value for video_table_count.ATTRG
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    public void setAttrg(String attrg) {
        this.attrg = attrg == null ? null : attrg.trim();
    }
}