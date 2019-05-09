package com.hkj.service;


import com.hkj.pojo.Student;

import java.util.List;

public interface StudentService {

	List<Student> list();

	Student get(String s_email);

	Student updateByPrimaryKey(Student student);
}
