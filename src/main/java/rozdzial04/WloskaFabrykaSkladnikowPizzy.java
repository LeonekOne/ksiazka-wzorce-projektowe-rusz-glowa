package rozdzial04;

public class WloskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy{


    @Override
    public Ciasto utworzCiasto() {
        return new CienkieChrupkieCiasto();
    }

    @Override
    public Sos utworzSos() {
        return new SosMarinara();
    }

    @Override
    public Ser utworzSer() {
        return new SerReggiano();
    }

    @Override
    public Warzywa[] utworzWarzywa() {
        Warzywa warzywa[] = { new Czosnek(), new Cebula(), new Pieczarki(), new CzerwonaPapryka() };
        return warzywa;
    }

    @Override
    public Pepperoni utworzPepperoni() {
        return new PlastryPepperoni();
    }

    @Override
    public Malze utworzMalze() {
        return new SwiezeMalze();
    }
}
