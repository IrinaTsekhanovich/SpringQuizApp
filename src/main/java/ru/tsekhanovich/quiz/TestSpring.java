package ru.tsekhanovich.quiz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TeatBean teatBean = context.getBean("testBean", TeatBean.class);
        System.out.println(teatBean.getName());
        context.close();
    }
}
