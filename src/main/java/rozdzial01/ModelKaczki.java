package rozdzial01;

public class ModelKaczki extends Kaczka {

    public ModelKaczki() {
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new Kwacz();
    }

    public void wyświetl() {
        System.out.println("Jestem modelem kaczki!");
    }
}
