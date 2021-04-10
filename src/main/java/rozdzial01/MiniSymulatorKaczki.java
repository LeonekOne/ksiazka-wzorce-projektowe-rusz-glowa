package rozdzial01;

public class MiniSymulatorKaczki {

    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wykonajKwacz();
        dzika.wykonajLeć();

        Kaczka model = new ModelKaczki();
        model.wykonajLeć();
        model.ustawLatanieInterfejs(new LotZNapędemRakietowym());
        model.wykonajLeć();
    }
}
