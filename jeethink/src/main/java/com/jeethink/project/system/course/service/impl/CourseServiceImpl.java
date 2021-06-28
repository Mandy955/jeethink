package com.jeethink.project.system.course.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.jeethink.project.system.course.mapper.CourseMapper;
import com.jeethink.project.system.course.domain.Course;
import com.jeethink.project.system.course.service.ICourseService;
import com.jeethink.common.utils.text.Convert;

/**
 * 课程管理Service业务层处理
 * 
 * @author heng
 * @date 2021-04-06
 */
@Service
public class CourseServiceImpl implements ICourseService 
{
    @Autowired(required = false)
    private CourseMapper courseMapper;

    /**
     * 查询课程管理
     * 
     * @param id 课程管理ID
     * @return 课程管理
     */
    @Override
    public Course selectCourseById(Integer id)
    {
        return courseMapper.selectCourseById(id);
    }

    /**
     * 查询课程管理列表
     * 
     * @param course 课程管理
     * @return 课程管理
     */
    @Override
    public List<Course> selectCourseList(Course course)
    {
        return courseMapper.selectCourseList(course);
    }

    /**
     * 新增课程管理
     * 
     * @param course 课程管理
     * @return 结果
     */
    @Override
    public int insertCourse(Course course)
    {
        return courseMapper.insertCourse(course);
    }

    /**
     * 修改课程管理
     * 
     * @param course 课程管理
     * @return 结果
     */
    @Override
    public int updateCourse(Course course)
    {
        return courseMapper.updateCourse(course);
    }

    /**
     * 删除课程管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCourseByIds(String ids)
    {
        return courseMapper.deleteCourseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除课程管理信息
     * 
     * @param id 课程管理ID
     * @return 结果
     */
    @Override
    public int deleteCourseById(Integer id)
    {
        return courseMapper.deleteCourseById(id);
    }
}
