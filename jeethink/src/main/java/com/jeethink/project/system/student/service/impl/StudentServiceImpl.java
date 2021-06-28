package com.jeethink.project.system.student.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jeethink.project.system.student.mapper.StudentMapper;
import com.jeethink.project.system.student.domain.Student;
import com.jeethink.project.system.student.service.IStudentService;
import com.jeethink.common.utils.text.Convert;

/**
 * 学生管理Service业务层处理
 * 
 * @author heng
 * @date 2021-04-06
 */
@Service
public class StudentServiceImpl implements IStudentService 
{
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询学生管理
     * 
     * @param id 学生管理ID
     * @return 学生管理
     */
    @Override
    public Student selectStudentById(Integer id)
    {
        return studentMapper.selectStudentById(id);
    }

    /**
     * 查询学生管理列表
     * 
     * @param student 学生管理
     * @return 学生管理
     */
    @Override
    public List<Student> selectStudentList(Student student)
    {
        return studentMapper.selectStudentList(student);
    }

    /**
     * 新增学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    @Override
    public int insertStudent(Student student)
    {
        return studentMapper.insertStudent(student);
    }

    /**
     * 修改学生管理
     * 
     * @param student 学生管理
     * @return 结果
     */
    @Override
    public int updateStudent(Student student)
    {
        return studentMapper.updateStudent(student);
    }

    /**
     * 删除学生管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStudentByIds(String ids)
    {
        return studentMapper.deleteStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生管理信息
     * 
     * @param id 学生管理ID
     * @return 结果
     */
    @Override
    public int deleteStudentById(Integer id)
    {
        return studentMapper.deleteStudentById(id);
    }
}
