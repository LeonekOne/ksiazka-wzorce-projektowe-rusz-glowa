package rozdzial04;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {

    String nazwa;
    Ciasto ciasto;
    Sos sos;
    Warzywa warzywa[];
    Ser ser;
    Pepperoni pepperoni;
    Malze malze;

//    ArrayList dodatki = new ArrayList();

//    void przygotowanie() {
//        System.out.println("Przygotowanie: " + nazwa);
//        System.out.println("Wyrabianie ciasta...");
//        System.out.println("Dodawanie sosu...");
//        System.out.println("Dodatki: ");
//        for (int i = 0; i < dodatki.size(); i++) {
//            System.out.println("   " + dodatki.get(i));
//        }
//    }

    abstract void przygotowanie();

    void pieczenie() {
        System.out.println("Pieczenie: 25 minut w temperaturze 180 stopni Celsjusza");
    }

    void krojenie() {
        System.out.println("Krojenie pizzy na 8 kawałków");
    }

    void pakowanie() {
        System.out.println("Pakowanie pizzy w oficjalne pudełko naszej sieci Pizzerii");
    }

    void ustawNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String pobierzNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nazwa='" + nazwa + '\'' +
                ", ciasto=" + ciasto +
                ", sos=" + sos +
                ", warzywa=" + Arrays.toString(warzywa) +
                ", ser=" + ser +
                ", pepperoni=" + pepperoni +
                ", malze=" + malze +
                '}';
    }
}
