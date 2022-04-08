package Classes;

import java.util.ArrayList;

/**
 * Representa la clase AdditionalFruitInformation y su información
 * @autor Yeisson Augusto Vahos Cortes
 */
public class AdditionalFruitInformation {

    /**
     * Representa un objeto de la clase Fruit a la que pertenece una
     * información adicional que corresponde a una instancia de la clase
     * AdditionalFruitInformation
     */
    public Fruit fruit;

    /**
     * Representa el precio por kilogramo de una fruta que corresponde a una
     * instancia de la clase AdditionalFruitInformation
     */
    public float price;

    /**
     * Representa a la cantidad de kilogramos de una fruta a comprar que
     * corresponde a una instancia de la clase AdditionalFruitInformation
     */
    public int number;

    /**
     * Crea una instancia de la clase AdditionalFruitInformation
     * @param fruit Representa un objeto de la clase Fruit a la que
     *              pertenece una información adicional correspondiente a
     *              la instancia de la clase AdditionalFruitInformation que
     *              se está creando
     * @param price Representa el precio por kilogramo de una fruta
     *              correspondiente a la instancia de la clase
     *              AdditionalFruitInformation que se está creando
     * @param number Representa la cantidad de kilogramos de una fruta a
     *               comprar correspondiente a la instancia de la clase
     *               AdditionalFruitInformation que se está creando
     */
    public AdditionalFruitInformation(Fruit fruit, float price, int number) {
        this.fruit = fruit;
        this.price = price;
        this.number = number;
    }

    /**
     * Representa el método para obtener el objeto de la clase Fruit a la
     * que pertenece una información adicional correspondiente a una
     * instancia de la clase AdditionalFruitInformation
     * @return Un objeto de la clase Fruit a la que pertenece una información
     * adicional correspondiente a una instancia de la clase
     * AdditionalFruitInformation
     */
    public Fruit getFruit() {
        return fruit;
    }

    /**
     * Representa el método para modificar el objeto de la clase Fruit a la
     * que pertenece una información adicional correspondiente a una
     * instancia de la clase AdditionalFruitInformation
     * @param fruit Representa el objeto de la clase Fruit a asignar al
     *              atributo fruit de una información adicional
     *              correspondiente a una instancia de la clase
     *              AdditionalFruitInformation
     */
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    /**
     * Representa el método para obtener el precio por kilogramo de la
     * información adicional de una fruta correspondiente a una instancia de
     * la clase AdditionalFruitInformation
     * @return El valor correspondiente al precio por kilogramo de la
     * información adicional de una fruta correspondiente a una instancia
     * de la clase AdditionalFruitInformation
     */
    public float getPrice() {
        return price;
    }

    /**
     * Representa el método para modificar el precio por kilogramo de la
     * información adicional de una fruta correspondiente a una instancia
     * de la clase AdditionalFruitInformation
     * @param price Representa el valor a asignar al atributo precio de la
     *              información adicional de una fruta correspondiente a
     *              una instancia de la clase AdditionalFruitInformation
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Representa el método para obtener la cantidad de kilogramos a comprar de
     * la información adicional de una fruta correspondiente a una instancia de
     * la clase AdditionalFruitInformation
     * @return El valor correspondiente a la cantidad de kilogramos a comprar de
     * la información adicional de una fruta correspondiente a una instancia
     * de la clase AdditionalFruitInformation
     */
    public int getNumber() {
        return number;
    }

    /**
     * Representa el método para modificar la cantidad de kilogramos a comprar
     * de la información adicional de una fruta correspondiente a una
     * instancia de la clase AdditionalFruitInformation
     * @param number Representa el valor a asignar al atributo cantidad de
     *               kilogramos a comprar de la información adicional de una
     *               fruta correspondiente a una instancia de la clase
     *               AdditionalFruitInformation
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Representa el método para obtener la información de un objeto de la
     * clase AdditionalFruitInformation por medio de un string con una
     * estructura definida
     * @return Un String con la información adicional de una fruta
     * correspondiente a una instancia de la clase AdditionalFruitInformation
     */
    @Override
    public String toString() {
        return "Descripción de la fruta:" + "\n" + fruit.toString() +
                "\nPrecio por Kg: " + price + "\nCantidad: " + number;
    }
}
