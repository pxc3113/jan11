package com.ytc.mapper;

import com.ytc.model.TEatingVariety;

public interface TEatingVarietyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eating_variety
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    int deleteByPrimaryKey(Integer tVarityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eating_variety
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    int insert(TEatingVariety record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eating_variety
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    int insertSelective(TEatingVariety record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eating_variety
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    TEatingVariety selectByPrimaryKey(Integer tVarityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eating_variety
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    int updateByPrimaryKeySelective(TEatingVariety record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_eating_variety
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    int updateByPrimaryKey(TEatingVariety record);
}