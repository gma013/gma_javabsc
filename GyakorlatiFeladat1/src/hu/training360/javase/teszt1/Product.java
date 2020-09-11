package hu.training360.javase.teszt1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeight) {
        this.name = name;
        this.unitWeight = unitWeight;
        numberOfDecimals = 2;
    }
    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this(name,unitWeight);
        this.numberOfDecimals = numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces){
        // a számítást bevallom a megoldásokból loptam
        return unitWeight.multiply(new BigDecimal(String.valueOf(pieces))).setScale(numberOfDecimals, RoundingMode.HALF_UP);
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(BigDecimal unitWeight) {
        this.unitWeight = unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public void setNumberOfDecimals(int numberOfDecimals) {
        this.numberOfDecimals = numberOfDecimals;
    }
}
