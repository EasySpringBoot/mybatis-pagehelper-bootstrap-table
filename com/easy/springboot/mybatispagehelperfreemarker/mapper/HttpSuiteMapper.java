package com.easy.springboot.mybatispagehelperfreemarker.mapper;

import com.easy.springboot.mybatispagehelperfreemarker.model.HttpSuite;

public interface HttpSuiteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_suite
     *
     * @mbg.generated Fri Aug 11 13:25:36 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_suite
     *
     * @mbg.generated Fri Aug 11 13:25:36 CST 2017
     */
    int insert(HttpSuite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_suite
     *
     * @mbg.generated Fri Aug 11 13:25:36 CST 2017
     */
    int insertSelective(HttpSuite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_suite
     *
     * @mbg.generated Fri Aug 11 13:25:36 CST 2017
     */
    HttpSuite selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_suite
     *
     * @mbg.generated Fri Aug 11 13:25:36 CST 2017
     */
    int updateByPrimaryKeySelective(HttpSuite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table http_suite
     *
     * @mbg.generated Fri Aug 11 13:25:36 CST 2017
     */
    int updateByPrimaryKey(HttpSuite record);
}