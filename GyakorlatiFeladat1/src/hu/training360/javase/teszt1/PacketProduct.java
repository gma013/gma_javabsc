package hu.training360.javase.teszt1;

import java.math.BigDecimal;

public class PacketProduct extends Product{
    private int packingUnit;
    private BigDecimal weightOfBox;

    public PacketProduct(String name, BigDecimal unitWeight, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public PacketProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(int packingUnit) {
        this.packingUnit = packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    public void setWeightOfBox(BigDecimal weightOfBox) {
        this.weightOfBox = weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        // this.getUnitWeight()
        //this.getWeightOfBox()
        //this.getPackingUnit()
        // alapján még huiányzik a rendes számítás...
        return this.getWeightOfBox();

    }
}
