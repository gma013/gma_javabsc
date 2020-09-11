package hu.training360.javase.teszt2;
public class Pendrive {
    private String name;
    private double capacity;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pendrive(String name, double capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "A Pendrive adatai:{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent) {
        this.price=this.price*((1+percent)/100);
    }

    public int comparePricePerCapacity(Pendrive pendrive) {
        int retValue=0;
        if (this.price/this.capacity>pendrive.price/pendrive.capacity) {
            retValue=1;
        }
        if (this.price/this.capacity<pendrive.price/pendrive.capacity) {
            retValue=-1;
        }
        return retValue;
    }

    public boolean cheaperThan(Pendrive pendrive) {
        boolean retValue=false;
        if (this.price<pendrive.price) {
            retValue=true;
        }
        return retValue;
    }


}
