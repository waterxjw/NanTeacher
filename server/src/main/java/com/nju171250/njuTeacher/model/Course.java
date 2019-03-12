package com.nju171250.njuTeacher.model;

public class Course {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_id
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    private String courseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.teacher_id
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    private String teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_name
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    private String courseName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    public Course(String courseId, String teacherId, String courseName) {
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.courseName = courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    public Course() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_id
     *
     * @return the value of course.course_id
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_id
     *
     * @param courseId the value for course.course_id
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.teacher_id
     *
     * @return the value of course.teacher_id
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.teacher_id
     *
     * @param teacherId the value for course.teacher_id
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_name
     *
     * @return the value of course.course_name
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_name
     *
     * @param courseName the value for course.course_name
     *
     * @mbggenerated Mon Mar 11 20:03:45 CST 2019
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}