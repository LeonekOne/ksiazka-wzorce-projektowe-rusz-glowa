package rozdzial04;

public class AmerykanskaSerowaPizza extends Pizza {

//    public AmerykanskaSerowaPizza() {
//        nazwa = "Amerykańska Pizza Serowa";
//        ciasto = "Extra grube, kruche ciasto";
//        sos = "Sos z pomidorów śliwkowych";
//
//        dodatki.add("Grubo tarty ser Mozzarella");
//    }

    @Override
    void przygotowanie() {

    }

    @Override
    void krojenie() {
        System.out.println("Krojenie pizzy na kwadratowe kawałki");
    }
}
