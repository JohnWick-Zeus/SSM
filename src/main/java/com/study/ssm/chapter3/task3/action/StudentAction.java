package com.study.ssm.chapter3.task3.action;

import com.study.ssm.chapter3.task3.biz.IStudentBiz;

public class StudentAction {
    private IStudentBiz studentBiz;

    public void setStudentBiz(IStudentBiz studentBiz){
        this.studentBiz = studentBiz;
    }

    public void printName(){
        System.out.println(studentBiz.getName());
    }
}
