package hu.training360.javase.teszt2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pendrive> pendrives = new ArrayList<>();

        Pendrive pd1 = new Pendrive("Kingston",16,1000);
        pendrives.add(pd1);
        Pendrive pd2 = new Pendrive("Kínai gagyi",32,1800);
        pendrives.add(pd2);
        Pendrive pd3 = new Pendrive("Drága",8,12000);
        pendrives.add(pd3);
        Pendrive pd4 = new Pendrive("Kínai jobb",32,1850);
        pendrives.add(pd4);

        System.out.println("\nLegjobb ár/kapacitás értékű pendrive: "+Pendrives.best(pendrives));
        System.out.println("Legeslegolcsóbb: "+Pendrives.cheapest(pendrives));

        System.out.println("\nÁremelés előtt a 32 gigás 1: "+pd2.toString());
        System.out.println("Áremelés előtt a 32 gigás 2: "+pd4.toString());
        System.out.println("  Áremelés...");
        Pendrives.risePriceWhereCapacity(pendrives,10,32);
                System.out.println("10% áremelés után a 32 gigás 1: "+pd2.toString());
        System.out.println("10 áremelés után a 32 gigás 2: "+pd4.toString());

    }
}
