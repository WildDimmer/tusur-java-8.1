package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.Data;

@Data

public class CurrencyConverter {
    private static final BigDecimal CHANGE_RATE = new BigDecimal("0.85");
    private BigDecimal dollars;

    public CurrencyConverter(BigDecimal dollars) {
        this.dollars = dollars;
    }
    public static BigDecimal convertToEuros(BigDecimal dollars) {
        return dollars
                .multiply(CHANGE_RATE)
                .setScale(2, RoundingMode.HALF_UP);
    }

}
