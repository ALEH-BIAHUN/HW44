package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component

public class Engine {
    @Value("${engine.engineBrand}")
    private String engineBrand;
    @Value("${engine.enginePower}")
    private Double enginePower;
    @Value("${engine.engineNumberOfCylinders}")
    private Integer engineNumberOfCylinders;
}
