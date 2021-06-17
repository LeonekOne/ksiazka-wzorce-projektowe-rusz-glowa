package rozdzial03;

public class BitaŚmietana extends SkładnikDekorator {


    Napoj napój;

    public BitaŚmietana(Napoj napój) {
        this.napój = napój;
    }

    @Override
    public String pobierzOpis() {
        return napój.pobierzOpis() + ", Bita Śmietana";
    }

    @Override
    public double koszt() {
        return napój.koszt() + 0.10;
    }
}
