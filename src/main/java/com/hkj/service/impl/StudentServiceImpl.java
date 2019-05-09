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

	/**
	 * 登陆用，成功返回对象，不成功返回空
	 * @param s_email
	 * @return
	 */
	@Override
	public Student get(String s_email) {
		StudentExample studentExample = new StudentExample();
		StudentExample.Criteria criteria = studentExample.createCriteria();
		criteria.andS_emailEqualTo(s_email);
		Student s = null;
		try {
            s = studentMapper.selectByExample(studentExample).get(0);
        }catch (Exception e){
		    s = null;
        }
		return s;
	}

	/**
	 * 个人设置用，将设置好的对象返回给Controller
	 * @param student
	 * @return
	 */
	@Override
	public Student updateByPrimaryKey(Student student) {
		studentMapper.updateByPrimaryKey(student);
		return null;
	}
}
