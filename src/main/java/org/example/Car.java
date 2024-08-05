package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private Wheel wheel;
    private Engine engine;
    private Transmission transmission;
    private String mark;
}