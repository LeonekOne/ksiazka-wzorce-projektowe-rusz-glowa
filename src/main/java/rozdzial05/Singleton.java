package rozdzial05;

public class Singleton {

    private static Singleton unikalnaInstancja;

    // tutaj umieść inne użyteczne zmienne obiektowe

    private Singleton() {}

    public static Singleton pobierzInstancje() {
        if (unikalnaInstancja == null) {
            unikalnaInstancja = new Singleton();
        }
        return unikalnaInstancja;
    }

    // tutaj umieść inne użyteczne metody
}
