package com.jeethink.project.system.course.service;

import java.util.List;
import com.jeethink.project.system.course.domain.Course;

/**
 * 课程管理Service接口
 * 
 * @author heng
 * @date 2021-04-06
 */
public interface ICourseService 
{
    /**
     * 查询课程管理
     * 
     * @param id 课程管理ID
     * @return 课程管理
     */
    public Course selectCourseById(Integer id);

    /**
     * 查询课程管理列表
     * 
     * @param course 课程管理
     * @return 课程管理集合
     */
    public List<Course> selectCourseList(Course course);

    /**
     * 新增课程管理
     * 
     * @param course 课程管理
     * @return 结果
     */
    public int insertCourse(Course course);

    /**
     * 修改课程管理
     * 
     * @param course 课程管理
     * @return 结果
     */
    public int updateCourse(Course course);

    /**
     * 批量删除课程管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCourseByIds(String ids);

    /**
     * 删除课程管理信息
     * 
     * @param id 课程管理ID
     * @return 结果
     */
    public int deleteCourseById(Integer id);
}
