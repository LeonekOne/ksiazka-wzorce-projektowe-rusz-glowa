package rozdzial04;

public class OwoceMorzaPizza extends Pizza {

    FabrykaSkladnikowPizzy fabrykaSkladnikow;

    public OwoceMorzaPizza(FabrykaSkladnikowPizzy fabrykaSkladnikow) {
        this.fabrykaSkladnikow = fabrykaSkladnikow;
    }

    @Override
    void przygotowanie() {
        System.out.println("Przygotowanie: " + nazwa);
        ciasto = fabrykaSkladnikow.utworzCiasto();
        sos = fabrykaSkladnikow.utworzSos();
        ser = fabrykaSkladnikow.utworzSer();
        malze = fabrykaSkladnikow.utworzMalze();
    }
}
