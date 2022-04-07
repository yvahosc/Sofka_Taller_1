package Classes;

import java.util.ArrayList;

public class AdditionalFruitInformation {
    public Fruit fruit;
    public float price;
    public int number;

    public AdditionalFruitInformation(Fruit fruit, float price, int number) {
        this.fruit = fruit;
        this.price = price;
        this.number = number;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Descripción de la fruta:" + "\n" + fruit.toString() +
                "\nPrecio por Kg: " + price + "\nCantidad: " + number;
    }
}
