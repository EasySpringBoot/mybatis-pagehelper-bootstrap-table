package com.easy.springboot.mybatispagehelperfreemarker.mapper;

import com.easy.springboot.mybatispagehelperfreemarker.model.UserRole;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated Fri Aug 11 12:53:13 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated Fri Aug 11 12:53:13 CST 2017
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated Fri Aug 11 12:53:13 CST 2017
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated Fri Aug 11 12:53:13 CST 2017
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated Fri Aug 11 12:53:13 CST 2017
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated Fri Aug 11 12:53:13 CST 2017
     */
    int updateByPrimaryKey(UserRole record);
}