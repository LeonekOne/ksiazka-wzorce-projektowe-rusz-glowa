package rozdzial03;

public class Czekolada extends SkładnikDekorator {

    Napoj napój;

    public Czekolada(Napoj napój) {
        this.napój = napój;
    }

    @Override
    public String pobierzOpis() {
        return napój.pobierzOpis() + ", Czekolada";
    }

    @Override
    public double koszt() {
        return napój.koszt() + 0.20;
    }
}
