package com.atguigu.bean;

public class Area {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.id
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.name
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.org_id
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    private String orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.status
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.id
     *
     * @return the value of area.id
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.id
     *
     * @param id the value for area.id
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.name
     *
     * @return the value of area.name
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.name
     *
     * @param name the value for area.name
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.org_id
     *
     * @return the value of area.org_id
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.org_id
     *
     * @param orgId the value for area.org_id
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.status
     *
     * @return the value of area.status
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.status
     *
     * @param status the value for area.status
     *
     * @mbggenerated Sat Apr 21 09:54:16 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}