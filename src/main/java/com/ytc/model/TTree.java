package com.ytc.model;

public class TTree {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tree.ID
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tree.TEXT
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    private String text;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tree.URL
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tree.PID
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    private String pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tree.ID
     *
     * @return the value of t_tree.ID
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tree.ID
     *
     * @param id the value for t_tree.ID
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tree.TEXT
     *
     * @return the value of t_tree.TEXT
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tree.TEXT
     *
     * @param text the value for t_tree.TEXT
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tree.URL
     *
     * @return the value of t_tree.URL
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tree.URL
     *
     * @param url the value for t_tree.URL
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tree.PID
     *
     * @return the value of t_tree.PID
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tree.PID
     *
     * @param pid the value for t_tree.PID
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
}