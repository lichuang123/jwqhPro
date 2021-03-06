package com.thinkgem.jeesite.modules.video_m_n.dao;

import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.video_m_n.entity.NovelTable;

@MyBatisDao
public interface NovelTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int insert(NovelTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int insertSelective(NovelTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    NovelTable selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int updateByPrimaryKeySelective(NovelTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_table
     *
     * @mbggenerated Mon Nov 28 22:59:27 CST 2016
     */
    int updateByPrimaryKey(NovelTable record);
}