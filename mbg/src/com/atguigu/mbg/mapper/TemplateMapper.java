package com.atguigu.mbg.mapper;

import com.atguigu.bean.Template;
import java.util.List;

public interface TemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int insert(Template record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    Template selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    List<Template> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    int updateByPrimaryKey(Template record);
}