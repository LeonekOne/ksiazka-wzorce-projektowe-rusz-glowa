package rozdzial01;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydła();
    }

    public void wyświetl() {
        System.out.println("Jestem prawdziwą Dziką Kaczką");
    }
}
