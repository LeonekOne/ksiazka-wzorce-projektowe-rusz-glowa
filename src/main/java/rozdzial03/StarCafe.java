package rozdzial03;

public class StarCafe {

    public static void main(String[] args) {
        Napoj napoj = new Espresso();
        System.out.println(napoj.pobierzOpis() + " " + napoj.koszt() + " zł");

        Napoj napoj2 = new MocnoPalona();
        napoj2 = new Czekolada(napoj2);
        napoj2 = new Czekolada(napoj2);
        napoj2 = new BitaŚmietana(napoj2);
        System.out.println(napoj2.pobierzOpis() + " " + napoj2.koszt() + " zł");

        Napoj napoj3 = new StarCafeSpecial();
        napoj3 = new MleczkoSojowe(napoj3);
        napoj3 = new Czekolada(napoj3);
        napoj3 = new BitaŚmietana(napoj3);
        System.out.println(napoj3.pobierzOpis() + " " + napoj3.koszt() + " zł");

    }
}
