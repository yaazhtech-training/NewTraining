package com.yaazhtech.employeeData.abstractClass;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApp {

    public static void main(String[] args)
    {
        SpringApplication.run(DemoApp.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        City cty = context.getBean("city", City.class);
        cty.setId(01);
        cty.setName("Varanasi");
        State st = context.getBean("state", State.class);
        st.setName("UP");
        cty.setState(st);
        cty.showCityDetails();
    }
}
