package com.study.ssm.chapter3.task3.biz;

import com.study.ssm.chapter3.task3.dao.IStudentDao;

public class StudentBiz implements IStudentBiz {
    private IStudentDao studentDao;

    @Override
    public String getName() {
        return studentDao.getName();
    }

    public void setStudentDao(IStudentDao studentDao){
        this.studentDao = studentDao;
    }
}
