package com.techarrows.spring.launcher;

import com.techarrows.spring.pojo.Drawing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLauncher {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ta/spring/trainingContext.xml");
        Drawing drawing = (Drawing)applicationContext.getBean("circleDrawing");
        drawing.drawShape();
        drawing = (Drawing)applicationContext.getBean("triangleDrawing");
        drawing.drawShape();
    }
}
