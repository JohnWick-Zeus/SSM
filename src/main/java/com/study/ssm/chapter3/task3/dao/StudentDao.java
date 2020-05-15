package com.study.ssm.chapter3.task3.dao;

import com.study.ssm.chapter3.task3.action.StudentAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentDao implements IStudentDao {
    @Override
    public String getName() {
        return "持久层dao";
    }

    public static void main(String[] args) {
//        //默认文件路径是resources下那一级
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/study/ssm/chapter3/task3/applicationContext4.xml");

        //这个类,默认获取的是项目路径,默认文件路径是项目名下一级，与src同级。
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/study/ssm/chapter3/task3/applicationContext-dao.xml");
//        //如果前边加了file:则说明后边的路径就要写全路径了,就是绝对路径
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("file:/Users/zhanggong/IdeaProjects/SSM/src/main/java/com/study/ssm/chapter3/task3/applicationContext4.xml");
        StudentAction studentAction = (StudentAction) ctx.getBean("studentAction");
        studentAction.printName();
    }
}
