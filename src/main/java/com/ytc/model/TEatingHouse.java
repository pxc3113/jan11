package com.ytc.model;

public class TEatingHouse {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_eating_house.t_eating_id
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    private Integer tEatingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_eating_house.t_eating_name
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    private String tEatingName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_eating_house.t_eating_is
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    private Integer tEatingIs;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_eating_house.t_eating_id
     *
     * @return the value of t_eating_house.t_eating_id
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public Integer gettEatingId() {
        return tEatingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_eating_house.t_eating_id
     *
     * @param tEatingId the value for t_eating_house.t_eating_id
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public void settEatingId(Integer tEatingId) {
        this.tEatingId = tEatingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_eating_house.t_eating_name
     *
     * @return the value of t_eating_house.t_eating_name
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public String gettEatingName() {
        return tEatingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_eating_house.t_eating_name
     *
     * @param tEatingName the value for t_eating_house.t_eating_name
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public void settEatingName(String tEatingName) {
        this.tEatingName = tEatingName == null ? null : tEatingName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_eating_house.t_eating_is
     *
     * @return the value of t_eating_house.t_eating_is
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public Integer gettEatingIs() {
        return tEatingIs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_eating_house.t_eating_is
     *
     * @param tEatingIs the value for t_eating_house.t_eating_is
     *
     * @mbggenerated Tue Jan 11 14:08:22 CST 2022
     */
    public void settEatingIs(Integer tEatingIs) {
        this.tEatingIs = tEatingIs;
    }
}