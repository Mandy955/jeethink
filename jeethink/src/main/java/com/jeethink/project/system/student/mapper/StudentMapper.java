package com.jeethink.project.system.student.mapper;

import java.util.List;
import com.jeethink.project.system.student.domain.Student;

/**
 * 学生管理Mapper接口
 * 
 * @author heng
 * @date 2021-04-06
 */
public interface StudentMapper 
{
    /**
     * 查询学生管理
     * 
     * @param id 学生管理ID
     * @return 学生管理
     */
    public Student selectStudentById(Integer id);

    /**
     * 查询学生管理列表
     * 
     * @param student 学生管理
     * @return 学生管理集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 删除学生管理
     * 
     * @param id 学生管理ID
     * @return 结果
     */
    public int deleteStudentById(Integer id);

    /**
     * 批量删除学生管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudentByIds(String[] ids);
}
