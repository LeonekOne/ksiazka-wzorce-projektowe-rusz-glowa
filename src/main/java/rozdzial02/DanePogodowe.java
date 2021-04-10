package rozdzial02;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot{

    private ArrayList obserwatorzy;
    private float temperatura;
    private float wilgotność;
    private float ciśnienie;

    public DanePogodowe() {
        obserwatorzy = new ArrayList();
    }

    public void zarejestrujObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }

    public void usuńObserwatora(Obserwator o) {
        int i = obserwatorzy.indexOf(o);
        if (i >= 0)
            obserwatorzy.remove(i);
    }

    public void powiadomObserwatorów() {
        for (int i = 0; i < obserwatorzy.size(); i++) {
            Obserwator Obs = (Obserwator)  obserwatorzy.get(i);
            Obs.aktualizacja(temperatura, wilgotność, ciśnienie);
        }
    }

    public void odczytZmiana() {
        powiadomObserwatorów();
    }

    public void ustawOdczyt(float temperatura, float wilgotność, float ciśnienie) {
        this.temperatura = temperatura;
        this.wilgotność = wilgotność;
        this.ciśnienie = ciśnienie;
        odczytZmiana();
    }

    // tutaj zamieść inne metody klasy DanePogodowe


    /** Pierwotna wersja
     // deklaracje zmiennych obiektowych
     public void odczytZmiana() {
     float temp = pobierzTemperaturę();
     float wilgotność = pobierzWilgotność();
     float ciśnienie = pobierzCiśnienie();

     //        warunkiBieżąceWyświetl.aktualizacja(temp, wilgotność, ciśnienie);
     //        statystykaWyświetl.aktualizacja(temp, wilgotność, ciśnienie);
     //        prognozaWyświetl.aktualizacja(temp, wilgotność, ciśnienie);
    // w tym miejscu można wstawić inne metody obiektu PogodaDane
     */
}
