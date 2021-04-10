package rozdzial02;

public class WarunkiBieżąceWyświetl implements Obserwator, WyświetlElement {

    private float temperatura;
    private float wilgotność;
    private Podmiot danePogodowe;

    public WarunkiBieżąceWyświetl(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    public void aktualizacja(float temperatura, float wilgotność, float ciśnienie) {
        this.temperatura = temperatura;
        this.wilgotność = wilgotność;
        wyświetl();
    }

    public void wyświetl() {
        System.out.println("Warunki bieżące " + temperatura + " stopni C oraz "
            + wilgotność + "% wilgotność");
    }
}
