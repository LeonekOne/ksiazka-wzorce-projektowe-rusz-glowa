package rozdzial03;

public abstract class Napoj {
    String opis = "Napój nieznany";

    public String pobierzOpis() {
        return opis;
    }

    public abstract double koszt();
}
