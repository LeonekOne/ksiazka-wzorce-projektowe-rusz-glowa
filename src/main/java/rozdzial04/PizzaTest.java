package rozdzial04;

public class PizzaTest {

    public static void main(String[] args) {

        Pizzeria wloska = new WloskaPizzeria();
        Pizzeria amerykanska = new AmerykanskaPizzeria();

        Pizza pizza = wloska.zamowPizza("serowa");
        System.out.println("Eryk zamówił: " + pizza.pobierzNazwa() + "\n");

        pizza = amerykanska.zamowPizza("serowa");
        System.out.println("Jacek zamówił: " + pizza.pobierzNazwa() + "\n");
    }
}
