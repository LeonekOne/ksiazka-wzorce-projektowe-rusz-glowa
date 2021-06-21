package rozdzial05;

public class CzekoladowyKociol {

    private boolean pusty;
    private boolean ugotowany;

    private static CzekoladowyKociol unikalnaInstancja;

    private CzekoladowyKociol() {
        pusty = true;
        ugotowany = false;
    }

    public static synchronized CzekoladowyKociol pobierzInstancje() {
        if (unikalnaInstancja == null) {
            unikalnaInstancja = new CzekoladowyKociol();
        }
        return unikalnaInstancja;
    }


    public void napelniaj() {
        if (jestPusty()) {
            pusty = false;
            ugotowany = false;
            // napełniaj bojler mieszanką mleka i czekolady
        }
    }

    public void oprozniaj() {
        if (!jestPusty() && jestUgotowany()) {
            // opróżniaj bojler z ugotowanej mieszanki mleka i czekolady
            pusty = true;
        }
    }

    public void gotuj() {
        if (!jestPusty() && !jestUgotowany()) {
            // gotuj zawartość kotła
            ugotowany = true;
        }
    }

    public boolean jestPusty() {
        return pusty;
    }

    public boolean jestUgotowany() {
        return ugotowany;
    }

}
