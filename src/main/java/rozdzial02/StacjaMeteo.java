package rozdzial02;

public class StacjaMeteo {

    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBieżąceWyświetl warunkiBieżąceWyświetl = new WarunkiBieżąceWyświetl(danePogodowe);
//        StatystykaWyświetl statystykaWyświetl = new StatystykaWyświetl(danePogodowe);
//        PrognozaWyświetl prognozaWyświetl = new PrognozaWyświetl(danePogodowe);

        danePogodowe.ustawOdczyt(26.6f, 65f, 1013f);
        danePogodowe.ustawOdczyt(27.7f, 70f, 997.0f);
        danePogodowe.ustawOdczyt(25.5f, 90f, 997.0f);
    }
}
