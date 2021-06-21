package rozdzial04;

public abstract class Pizzeria {

    public Pizza zamowPizza(String type) {
        Pizza pizza;

        pizza = utworzPizza(type);
        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }

    abstract Pizza utworzPizza(String type);

    // Tutaj umieść inne metody
}
