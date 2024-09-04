package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope(value = "prototype")

public class Car {
    @Autowired
    public Car(Wheel wheel, Engine engine, Transmission transmission, String mark) {
        this.wheel = wheel;
        this.engine = engine;
        this.transmission = transmission;
        this.mark = mark;
    }

    private Wheel wheel;
    private Engine engine;
    private Transmission transmission;
    @Value("${car.name.mark}")
    private String mark;
}
