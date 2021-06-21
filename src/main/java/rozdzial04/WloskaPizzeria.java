package rozdzial04;

public class WloskaPizzeria extends Pizzeria {

    protected Pizza utworzPizza(String item) {
        Pizza pizza = null;

        FabrykaSkladnikowPizzy fabrykaSkladnikow = new WloskaFabrykaSkladnikowPizzy();

        if (item.equals("serowa")) {
            pizza = new SerowaPizza(fabrykaSkladnikow);
            pizza.ustawNazwa("Włoska Pizza Serowa");
//        } else if (item.equals("wegetariańska")) {
//            pizza = new WegetarianskaPizza(fabrykaSkladnikow);
//            pizza.ustawNazwa("Włoska Pizza Wegetariańska");
        } else if (item.equals("owoce morza")) {
            pizza = new OwoceMorzaPizza(fabrykaSkladnikow);
            pizza.ustawNazwa("Włoska Pizza Owoce Morza");
//        } else if (item.equals("pepperoni")) {
//            pizza = new PepperoniPizza(fabrykaSkladnikow);
//            pizza.ustawNazwa("Włoska Pizza Pepperoni");
        }
        return pizza;
    }
}
