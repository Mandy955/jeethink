package com.jeethink.project.system.course.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jeethink.framework.aspectj.lang.annotation.Excel;
import com.jeethink.framework.web.domain.BaseEntity;

/**
 * 课程管理对象 course
 * 
 * @author heng
 * @date 2021-04-06
 */
public class Course extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号ID */
    private Integer id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 老师 */
    @Excel(name = "老师")
    private String teacher;

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setTeacher(String teacher)
    {
        this.teacher = teacher;
    }

    public String getTeacher()
    {
        return teacher;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("teacher", getTeacher())
            .toString();
    }
}
