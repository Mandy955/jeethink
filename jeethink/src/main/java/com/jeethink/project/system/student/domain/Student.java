package com.jeethink.project.system.student.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jeethink.framework.aspectj.lang.annotation.Excel;
import com.jeethink.framework.web.domain.BaseEntity;

/**
 * 学生管理对象 student
 * 
 * @author heng
 * @date 2021-04-06
 */
public class Student extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号ID */
    private Integer id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 课程 */
    @Excel(name = "课程")
    private String course;

    /** 分数 */
    @Excel(name = "分数")
    private Long score;

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
    public void setAge(Long age)
    {
        this.age = age;
    }

    public Long getAge()
    {
        return age;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getCourse()
    {
        return course;
    }
    public void setScore(Long score)
    {
        this.score = score;
    }

    public Long getScore()
    {
        return score;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("age", getAge())
            .append("sex", getSex())
            .append("course", getCourse())
            .append("score", getScore())
            .toString();
    }
}
