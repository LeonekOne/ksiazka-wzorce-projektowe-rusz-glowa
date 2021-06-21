package rozdzial04;

public class SerowaPizza extends Pizza {

    FabrykaSkladnikowPizzy fabrykaSkladnikow;

    public SerowaPizza(FabrykaSkladnikowPizzy fabrykaSkladnikow) {
        this.fabrykaSkladnikow = fabrykaSkladnikow;
    }

    @Override
    void przygotowanie() {
        System.out.println("Przygotowanie: " + nazwa);
        ciasto = fabrykaSkladnikow.utworzCiasto();
        sos = fabrykaSkladnikow.utworzSos();
        ser = fabrykaSkladnikow.utworzSer();
    }
}
