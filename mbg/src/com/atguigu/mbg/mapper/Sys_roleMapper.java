package com.atguigu.mbg.mapper;

import com.atguigu.bean.Sys_role;
import java.util.List;

public interface Sys_roleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int insert(Sys_role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    Sys_role selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    List<Sys_role> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int updateByPrimaryKey(Sys_role record);
}