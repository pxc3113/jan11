package com.ytc.mapper;

import java.util.List;

import com.ytc.model.TTree;

public interface TTreeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tree
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    int insert(TTree record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tree
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    int insertSelective(TTree record);

    List<TTree> queryTTreeList();
}