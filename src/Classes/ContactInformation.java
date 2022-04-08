package Classes;

import java.time.LocalDate;

/**
 * Representa la clase ContactInformation y su información
 * @autor Yeisson Augusto Vahos Cortes
 */
public class ContactInformation {

    /**
     * Representa un objeto de la clase Person a la que pertenece una
     * información de contacto que corresponde a una instancia de la clase
     * ContactInformation
     */
    public Person person;

    /**
     * Representa el correo electrónico de la información de contacto de una
     * persona que corresponde a una instancia de la clase ContactInformation
     */
    private String email;

    /**
     * Representa la dirección correspondiente a la información de contacto de
     * una persona que corresponde a una instancia de la clase
     * ContactInformation
     */
    private String address;

    /**
     * Crea una instancia de la clase ContactInformation
     * @param person Representa un objeto de la clase Person a la que
     *               pertenece una información de contacto correspondiente a
     *               la instancia de la clase ContactInformation que se está
     *               creando
     * @param email Representa el correo electrónico de la información de
     *              contacto de una persona correspondiente a la instancia de
     *              la clase ContactInformation que se está creando
     * @param address Representa la dirección correspondiente a la
     *                información de contacto de una persona correspondiente
     *                a la instancia de la clase ContactInformation que se
     *                está creando
     */
    public ContactInformation(Person person, String email, String address) {
        this.person = person;
        this.email = email;
        this.address = address;
    }

    /**
     * Representa el método para obtener el objeto de la clase Person a la
     * que pertenece una información de contacto correspondiente a una
     * instancia de la clase ContactInformation
     * @return Un objeto de la clase Person a la que pertenece una
     * información de contacto correspondiente a una instancia de la clase
     * ContactInformation
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Representa el método para modificar el objeto de la clase Person a la
     * que pertenece una información de contacto correspondiente a una
     * instancia de la clase ContactInformation
     * @param person Representa el objeto de la clase Person a asignar al
     *               atributo person de una información de contacto
     *               correspondiente a una instancia de la clase
     *               ContactInformation
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Representa el método para obtener el correo electrónico de la
     * información de contacto de una persona correspondiente a una instancia
     * de la clase ContactInformation
     * @return El valor correspondiente al correo electrónico de la
     * información de contacto de una persona correspondiente a una instancia
     * de la clase ContactInformation
     */
    public String getEmail() {
        return email;
    }

    /**
     * Representa el método para modificar el correo electrónico de la
     * información de contacto de una persona correspondiente a una instancia
     * de la clase ContactInformation
     * @param email Representa el valor a asignar al atributo correo
     *              electrónico de la información de contacto de una persona
     *              correspondiente a una instancia de la clase
     *              ContactInformation
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Representa el método para obtener la dirección de la información de
     * contacto de una persona correspondiente a una instancia de la clase
     * ContactInformation
     * @return El valor correspondiente a la dirección de la información de
     * contacto de una persona correspondiente a una instancia de la clase
     * ContactInformation
     */
    public String getAddress() {
        return address;
    }

    /**
     * Representa el método para modificar la dirección de la información de
     * contacto de una persona correspondiente a una instancia de la clase
     * ContactInformation
     * @param address Representa el valor a asignar al atributo dirección de la
     *                información de contacto de una persona correspondiente
     *                a una instancia de la clase ContactInformation
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Representa el método para obtener la información de un objeto de la
     * clase ContactInformation por medio de un string con una estructura
     * definida
     * @return Un String con la información de contacto de una persona
     * correspondiente a una instancia de la clase ContactInformation
     */
    @Override
    public String toString() {
        return "Información de contacto:" + "\n" + person.toString() +
                "\nEmail: " + email + "\nDirección: " + address;

    }
}
