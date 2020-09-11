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

        System.out.println("Legjobb ár/kapacitás értékű pendrive: "+Pendrives.best(pendrives));
        System.out.println("Legeslegolcsóbb: "+Pendrives.cheapest(pendrives));

    }
}
