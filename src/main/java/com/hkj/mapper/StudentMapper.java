package com.hkj.mapper;

import com.hkj.pojo.Student;
import com.hkj.pojo.StudentExample;
import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer s_id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer s_id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}