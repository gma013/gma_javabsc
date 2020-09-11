package hu.training360.javase.teszt2;

import java.util.ArrayList;
import java.util.List;

public class Pendrives {

    static public Pendrive best (List<Pendrive> pendrives) {
        Pendrive maxPriceCapPendrive=pendrives.get(0);
        for (Pendrive pd:pendrives) {
            if (pd.comparePricePerCapacity(maxPriceCapPendrive)<0) {
                maxPriceCapPendrive=pd;
            }
        }
        return maxPriceCapPendrive;
    }

    static public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive minPricePendrive=pendrives.get(0);
        for (Pendrive pd:pendrives) {
            if (pd.cheaperThan(minPricePendrive)) {
                minPricePendrive=pd;
            }
        }
        return minPricePendrive;
    }

}
