package com.sdaMRymarczyk;

import java.math.BigDecimal;

public class Money {

    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public Money(BigDecimal value) {
        this.value = value;
    }

    public Money(double value) {
        this.value = BigDecimal.valueOf(value);
    }

    public Money multiplyBy(float multiplier) {
        return new Money(value.multiply(BigDecimal.valueOf(multiplier)));
    }

    public Money add(Money money) {
        return new Money(this.value.add(money.getValue()));
    }

    public Money subtract(Money money) {
        return new Money(this.value.subtract(money.getValue()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return value != null ? value.equals(money.value) : money.value == null;
    }

    public int compareTo(Money money) {
        return this.value.compareTo(money.getValue());
    }

    public boolean compareValue(Money money) {
        if(this.value.compareTo(money.getValue()) == 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}

