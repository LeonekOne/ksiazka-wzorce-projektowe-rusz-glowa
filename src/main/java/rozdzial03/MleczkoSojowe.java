package rozdzial03;

public class MleczkoSojowe extends SkładnikDekorator {

    Napoj napój;

    public MleczkoSojowe(Napoj napój) {
        this.napój = napój;
    }

    @Override
    public String pobierzOpis() {
        return napój.pobierzOpis() + ", Mleczko Sojowe";
    }

    @Override
    public double koszt() {
        return napój.koszt() + 0.15;
    }

}
