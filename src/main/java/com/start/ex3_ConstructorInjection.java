package com.start;

import com.start.entities.Entity1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ex3_ConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("constructorInjection.xml");

        Entity1 fse1 = (Entity1) context.getBean("f1");
        System.out.println(fse1);

        Entity1 fse2 = context.getBean("f1", Entity1.class);
        System.out.println(fse2);
        System.out.println(fse1.equals(fse2));

        Entity1 fse3 = context.getBean("f2", Entity1.class);
        System.out.println(fse3);

        Entity1 fse4 = context.getBean("f3", Entity1.class);
        System.out.println(fse4);

        Entity1 fse5 = context.getBean("f4", Entity1.class);
        System.out.println(fse5);

        Entity1 fse6 = context.getBean("f5", Entity1.class);
        System.out.println(fse6);

        Entity1 fse7 = context.getBean("f6", Entity1.class);
        System.out.println(fse7);

    }
}
