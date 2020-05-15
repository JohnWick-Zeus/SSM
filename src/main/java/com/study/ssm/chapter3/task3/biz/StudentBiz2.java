package com.study.ssm.chapter3.task3.biz;

import com.study.ssm.chapter3.task3.dao.IStudentDao;

// 实现IStudentBiz接口的另一个类
public class StudentBiz2 implements IStudentBiz {
    private IStudentDao studentDao;

    @Override
    public String getName() {
        return "李四";
    }

    public void setStudentDao(IStudentDao studentDao){
        this.studentDao = studentDao;
    }

    public String getCity(){return "武汉市";}
}
