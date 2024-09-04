package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope(value = "prototype")

public class Transmission {
    @Value("${transmission.maxGear}")
    private Integer maxGear;
    @Value("${transmission.transmissionBrand}")
    private String transmissionBrand;
}
