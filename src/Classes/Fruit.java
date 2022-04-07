package Classes;

import java.util.ArrayList;

/**
 * Representa la clase fruta y su información
 * @autor Yeisson Augusto Vahos Cortes
 */
public class Fruit {

    /**
     * Representa el nombre de una fruta que corresponde a una instancia de
     * la clase fruta
     */
    public String name;

    /**
     * Representa el peso promedio de una fruta que corresponde a una instancia
     * de la clase fruta
     */
    private float averageWeight;

    /**
     * Representa los colores que puede presentar una fruta que corresponden a
     * una instancia de la clase fruta
     */
    public ArrayList<String> colors;

    /**
     * Crea una instancia de la clase fruta
     * @param name Representa el nombre de la fruta correspondiente a la
     *             instancia de la clase fruta que se está creando
     * @param averageWeight Representa el peso promedio de la fruta
     *                      correspondiente a la instancia de la clase
     *                      fruta que se está creando
     * @param colors Representa los colores que puede presentar la fruta
     *               correspondiente a la instancia de la clase fruta que se
     *               está creando
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Representa el método para obtener el nombre de una fruta
     * correspondiente a una instancia de la clase fruta
     * @return El valor correspondiente al nombre de una fruta
     * correspondiente a una instancia de la clase fruta
     */
    public String getName() {
        return name;
    }

    /**
     * Representa el método para modificar el nombre de una fruta
     * correspondiente a una instancia de la clase fruta
     * @param name Representa el valor a asignar al atributo nombre de una
     *             fruta correspondiente a una instancia de la clase fruta
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Representa el método para obtener el peso promedio de una fruta
     * correspondiente a una instancia de la clase fruta
     * @return El valor correspondiente al peso promedio de una fruta
     * correspondiente a una instancia de la clase fruta
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Representa el método para modificar el peso promedio de una fruta
     * correspondiente a una instancia de la clase fruta
     * @param averageWeight Representa el valor a asignar al atributo peso
     *                      promedio de una fruta correspondiente a una
     *                      instancia de la clase fruta
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Representa el método para obtener los colores que puede presentar una
     * fruta correspondiente a una instancia de la clase fruta
     * @return Una lista correspondiente a los colores que puede presentar
     * una fruta correspondiente a una instancia de la clase fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Representa el método para modificar los colores que puede presentar
     * una fruta correspondiente a una instancia de la clase fruta
     * @param colors Representa una lista a asignar al atributo colores que
     *               puede presentar una fruta correspondiente a una
     *               instancia de la clase fruta
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Representa el método para obtener la información de un objeto de la
     * clase fruta en por medio de un string con una estructura definida
     * @return Un String con la información de una fruta correspondiente
     * a una instancia de la clase fruta
     */
    @Override
    public String toString() {
        return "Nombre: " + name +
                "\nPeso promedio por unidad [Kg]: " + averageWeight +
                "\nColores: " + colors;
    }
}
