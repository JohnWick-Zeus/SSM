package com.study.ssm.chapter3.task4;

import com.study.ssm.chapter3.task3.action.StudentAction;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.IOException;
import java.util.List;

public class JDOMTest {
    public static void main(String[] args){
        //这个类,默认获取的是项目路径,默认文件路径是项目名下一级，与src同级。
        String path = "src/main/java/com/study/ssm/chapter3/task4/applicationContext4.xml";
        SAXBuilder sb = new SAXBuilder();
        Document doc;
        try{
            doc = sb.build(path);
            Element root = doc.getRootElement();
            //没有特殊情况还是加上namespace去检索getChildren和getChild方法
            Namespace namespace = root.getNamespace();
            List list = root.getChildren();
            for (int i=0; i<list.size(); i++){
                Element element = (Element)list.get(i);
                //得到bean的id值
                String id = element.getAttributeValue("id");
                //得到bean的class属性值
                String classValue = element.getAttributeValue("class");
                //得到子元素property属性值
                Element propertyElement = element.getChild("property", namespace);
                //得到name属性值
                String name = propertyElement.getAttributeValue("name");
                String ref = propertyElement.getAttributeValue("ref");
                System.out.println(ref);
            }

        } catch (JDOMException | IOException e){
            e.printStackTrace();
        }



    }
}
