package Classes;

import java.time.LocalDate;

/**
 * Representa la clase Person y su información
 * @autor Yeisson Augusto Vahos Cortes
 */

public class Person {

    /**
     * Representa el número de identificación de una persona que corresponde
     * a una instancia de la clase Person
     */
    private int personId;

    /**
     * Representa el nombre de una persona que corresponde a una instancia de
     * la clase Person
     */
    public String name;

    /**
     * Representa el primer apellido de una persona que corresponde a una
     * instancia de la clase Person
     */
    public String lastName1;

    /**
     * Representa el segundo apellido de una persona que corresponde a una
     * instancia de la clase Person
     */
    public String lastName2;

    /**
     * Representa la fecha de nacimiento de una persona que corresponde a una
     * instancia de la clase Person
     */
    public LocalDate dateBirth;

    /**
     * Representa el peso de una persona que corresponde a una instancia de
     * la clase Person
     */
    public float height;

    /**
     * Crea una instancia de la clase Person
     * @param personId Representa el numero que identifica a la instancia de
     *                 la clase Person que se está creando
     * @param name Representa el nombre de la persona correspondiente a la
     *             instancia de la clase Person que se está creando
     * @param lastName1 Representa el primer apellido de la persona
     *                  correspondiente a la instancia de la clase Person que
     *                  se está creando
     * @param lastName2 Representa el segundo apellido de la persona
     *                  correspondiente a la instancia de la clase Person que
     *                  se está creando
     */
    public Person(
            int personId,
            String name,
            String lastName1,
            String lastName2)
    {
        this.personId = personId;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }

    /**
     * Representa el método para obtener el número de identificación de una
     * persona correspondiente a una instancia de la clase Person
     * @return El valor correspondiente al número de identificación de una
     * persona correspondiente a una instancia de la clase Person
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Representa el método para modificar el número de identificación de una
     * persona correspondiente a una instancia de la clase Person
     * @param personId Representa el valor a asignar al atributo numero de
     *                 identificación de una persona correspondiente a una
     *                 instancia de la clase Person
     */
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    /**
     * Representa el método para obtener el nombre de una persona
     * correspondiente a una instancia de la clase Person
     * @return El valor correspondiente al nombre de una persona
     * correspondiente a una instancia de la clase Person
     */
    public String getName() {
        return name;
    }

    /**
     * Representa el método para modificar el nombre de una persona
     * correspondiente a una instancia de la clase Person
     * @param name Representa el valor a asignar al atributo nombre de una
     *             persona correspondiente a una instancia de la clase Person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Representa el método para obtener el primer apellido de una persona
     * correspondiente a una instancia de la clase Person
     * @return El valor correspondiente al primer apellido de una persona
     * correspondiente a una instancia de la clase Person
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Representa el método para modificar el primer apellido de una persona
     * correspondiente a una instancia de la clase Person
     * @param lastName1 Representa el valor a asignar al atributo primer
     *                  apellido de una persona correspondiente a una
     *                  instancia de la clase Person
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Representa el método para obtener el segundo apellido de una persona
     * correspondiente a una instancia de la clase Person
     * @return El valor correspondiente al segundo apellido de una persona
     * correspondiente a una instancia de la clase Person
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Representa el método para modificar el segundo apellido de una persona
     * correspondiente a una instancia de la clase Person
     * @param lastName2 Representa el valor a asignar al atributo segundo
     *                  apellido de una persona correspondiente a una
     *                  instancia de la clase Person
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Representa el método para obtener la fecha de nacimiento de una persona
     * correspondiente a una instancia de la clase Person
     * @return El valor correspondiente a la fecha de nacimiento de una persona
     * correspondiente a una instancia de la clase Person
     */
    public LocalDate getDateBirth() {
        return dateBirth;
    }

    /**
     * Representa el método para modificar la fecha de nacimiento de una
     * persona correspondiente a una instancia de la clase Person
     * @param dateBirth Representa el valor a asignar al atributo fecha de
     *                  nacimiento de una persona correspondiente a una
     *                  instancia de la clase Person
     */
    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Representa el método para obtener el peso de una persona
     * correspondiente a una instancia de la clase Person
     * @return El valor correspondiente al peso de una persona
     * correspondiente a una instancia de la clase Person
     */
    public float getHeight() {
        return height;
    }

    /**
     * Representa el método para modificar el peso de una persona
     * correspondiente a una instancia de la clase Person
     * @param height Representa el valor a asignar al atributo peso de una
     *               persona correspondiente a una instancia de la clase Person
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Representa el método para obtener la información de un objeto de la
     * clase Person por medio de un string con una estructura definida
     * @return Un String con la información de una persona correspondiente
     * a una instancia de la clase Person
     */
    @Override
    public String toString() {
        return "Identificación: " + personId + "\nNombre: " + name +
                "\nApellidos: " + lastName1 + ' ' + lastName2;
    }
}
