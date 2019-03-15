package com.nju171250.njuTeacher.model;

import java.util.Date;

public class Comment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    private String commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.course_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    private String courseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.user_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_content
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    private String commentContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_stars
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    private Integer commentStars;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_time
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    private Date commentTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.like_num
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    private Integer likeNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public Comment(String commentId, String courseId, String userId, String commentContent, Integer commentStars, Date commentTime, Integer likeNum) {
        this.commentId = commentId;
        this.courseId = courseId;
        this.userId = userId;
        this.commentContent = commentContent;
        this.commentStars = commentStars;
        this.commentTime = commentTime;
        this.likeNum = likeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public Comment() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_id
     *
     * @return the value of comment.comment_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_id
     *
     * @param commentId the value for comment.comment_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.course_id
     *
     * @return the value of comment.course_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.course_id
     *
     * @param courseId the value for comment.course_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.user_id
     *
     * @return the value of comment.user_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.user_id
     *
     * @param userId the value for comment.user_id
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_content
     *
     * @return the value of comment.comment_content
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_content
     *
     * @param commentContent the value for comment.comment_content
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_stars
     *
     * @return the value of comment.comment_stars
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public Integer getCommentStars() {
        return commentStars;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_stars
     *
     * @param commentStars the value for comment.comment_stars
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public void setCommentStars(Integer commentStars) {
        this.commentStars = commentStars;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_time
     *
     * @return the value of comment.comment_time
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_time
     *
     * @param commentTime the value for comment.comment_time
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.like_num
     *
     * @return the value of comment.like_num
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public Integer getLikeNum() {
        return likeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.like_num
     *
     * @param likeNum the value for comment.like_num
     *
     * @mbggenerated Fri Mar 15 15:45:06 CST 2019
     */
    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }
}