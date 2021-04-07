package rozdzial01;

public abstract class Kaczka {

    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public Kaczka() {}

    public abstract void wyświetl();

    public void wykonajLeć() {
        latanieInterfejs.leć();
    }

    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }

    public void pływaj() {
        System.out.println("Wszystkie kaczki pływają, nawet te sztuczne!");
    }

}
