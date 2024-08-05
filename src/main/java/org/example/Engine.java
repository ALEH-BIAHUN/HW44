package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Engine {
    private String engineBrand;
    private Double enginePower;
    private Integer engineNumberOfCylinders;
}