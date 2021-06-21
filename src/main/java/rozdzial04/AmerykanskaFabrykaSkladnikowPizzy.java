package rozdzial04;

public class AmerykanskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy {


    @Override
    public Ciasto utworzCiasto() {
        return new GrubeChrupkieCiasto();
    }

    @Override
    public Sos utworzSos() {
        return new SosPomidorowy();
    }

    @Override
    public Ser utworzSer() {
        return new SerMozzarella();
    }

    @Override
    public Warzywa[] utworzWarzywa() {
        Warzywa warzywa[] = { new Szpinak(), new CzarneOliwki(), new Baklazan() };
        return warzywa;
    }

    @Override
    public Pepperoni utworzPepperoni() {
        return new PlastryPepperoni();
    }

    @Override
    public Malze utworzMalze() {
        return new MrozoneMalze();
    }
}
