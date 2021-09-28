package com.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("constructorInjection.xml");

        FirstStartEntity fse1 = (FirstStartEntity) context.getBean("f1");
        System.out.println(fse1);

        FirstStartEntity fse2 = context.getBean("f1", FirstStartEntity.class);
        System.out.println(fse2);
        System.out.println(fse1.equals(fse2));

        FirstStartEntity fse3 = context.getBean("f2", FirstStartEntity.class);
        System.out.println(fse3);

        FirstStartEntity fse4 = context.getBean("f3", FirstStartEntity.class);
        System.out.println(fse4);

        FirstStartEntity fse5 = context.getBean("f4", FirstStartEntity.class);
        System.out.println(fse5);

        FirstStartEntity fse6 = context.getBean("f5", FirstStartEntity.class);
        System.out.println(fse6);

        FirstStartEntity fse7 = context.getBean("f6", FirstStartEntity.class);
        System.out.println(fse7);

    }
}
