package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Car car = (Car) context.getBean("car", Car.class);
        System.out.println(car);

        Car car1 = (Car) context.getBean("car", Car.class);
        System.out.println(car);

        Car car2 = (Car) context.getBean("car", Car.class);
        System.out.println(car);

        System.out.println(car2==car1);
    }
}