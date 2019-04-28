package com.hkj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hkj.pojo.Student;
import com.hkj.service.StudentService;
import com.hkj.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("")
public class StudetnController {

    @Autowired
    StudentService studentService;

    @RequestMapping("listStudent")
    public ModelAndView listCategory(Page page){
        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),5);
        List<Student> ss= studentService.list();
        int total = (int) new PageInfo<>(ss).getTotal();

        page.caculateLast(total);

        // 放入转发参数
        mav.addObject("ss", ss);
        // 放入jsp路径
        mav.setViewName("listStudent");
        return mav;
    }

    @RequestMapping("loginStudent")
    public ModelAndView loginStudent(Student student, HttpServletRequest request){
        int flag = 0;//flag 标记状态，0为不存在该用户，1为存在该用户，但密码错误，2为存在用户，密码正确
        ModelAndView mav = new ModelAndView();
        Student s = studentService.get(student.getS_email());
        mav.setViewName("../../login");
        mav.addObject("message","user does not exist!");
        if (s != null){
            flag = 1;
            mav.setViewName("../../login");
            mav.addObject("message","password is error!");
            if (student.getS_password().equals(s.getS_password())){
                flag = 2;
                mav.setViewName("test");
                request.getSession().setAttribute("student",s);
            }
        }
        return mav;
    }

    @RequestMapping("privateOptions")
    public ModelAndView privateOptions(Student student,HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        System.out.println("进入了privateOptions");
        return mav;
    }

    @RequestMapping("studentDispatcher")
    public ModelAndView studentDispatcher(Student student,HttpServletRequest request,String flag){
        ModelAndView mav = new ModelAndView();
        System.out.println("flag的值为:"+flag);
        if ("1".equals(flag)){
            mav.addObject("s",student);
            mav.setViewName("student/privateOptions");
        }else {
            mav.setViewName("error");
        }

        return mav;
    }

}
