package com.hkj.service.impl;

import com.hkj.mapper.StudentMapper;
import com.hkj.pojo.Student;
import com.hkj.pojo.StudentExample;
import com.hkj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper studentMapper;

	@Override
	public List<Student> list() {
		return null;
	}

	@Override
	public Student get(String s_email) {
		StudentExample studentExample = new StudentExample();
		StudentExample.Criteria criteria = studentExample.createCriteria();
		criteria.andS_emailEqualTo(s_email);
		System.out.println(studentMapper.selectByExample(studentExample).size());
		Student s = null;
		try {
            s = studentMapper.selectByExample(studentExample).get(0);
        }catch (Exception e){
		    s = null;
        }
		System.out.println(s);
		return s;
	}
}
