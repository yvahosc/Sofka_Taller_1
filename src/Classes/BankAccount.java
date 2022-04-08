package Classes;

import java.time.LocalDate;

/**
 * Representa la clase BankAccount y su información
 * @autor Yeisson Augusto Vahos Cortes
 */
public class BankAccount {

    /**
     * Representa un objeto de la clase persona a la que pertenece una
     * cuenta bancaria que corresponde a una instancia de la clase BankAccount
     */
    public Person person;

    /**
     * Representa el numero de cuenta de una cuenta bancaria que corresponde
     * a una instancia de la clase BankAccount
     */
    private int accountNumber;

    /**
     * Representa el estado de una cuenta bancaria que corresponde a una
     * instancia de la clase BankAccount
     */
    protected Boolean activated;

    /**
     * Representa el saldo de una cuenta bancaria que corresponde a una
     * instancia de la clase BankAccount
     */
    private float balance;

    /**
     * Crea una instancia de la clase BankAccount
     * @param person Representa un objeto de la clase Person a la que
     *               pertenece una cuenta bancaria correspondiente a la
     *               instancia de la clase BankAccount que se está creando
     * @param accountNumber Representa el numero de la cuenta de una cuenta
     *                      bancaria correspondiente a la instancia de la
     *                      clase BankAccount que se está creando
     * @param activated Representa el estado de la cuenta de una cuenta
     *                  bancaria correspondiente a la instancia de la clase
     *                  BankAccount que se está creando
     * @param balance Representa el saldo de la cuenta de una cuenta
     *                bancaria correspondiente a la instancia de la clase
     *                BankAccount que se está creando
     */
    public BankAccount(
            Person person,
            int accountNumber,
            Boolean activated,
            float balance)
    {
        this.person = person;
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.balance = balance;
    }

    /**
     * Representa el método para obtener el objeto de la clase Person a la
     * que pertenece una cuenta bancaria correspondiente a una instancia de
     * la clase BankAccount
     * @return Un objeto de la clase Person a la que pertenece una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Representa el método para modificar el objeto de la clase Person a la
     * que pertenece una cuenta bancaria correspondiente a una instancia de
     * la clase BankAccount
     * @param person Representa el objeto de la clase Person a asignar al
     *               atributo person de una cuenta bancaria correspondiente a
     *               una instancia de la clase BankAccount
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Representa el método para obtener el numero de cuenta de una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     * @return El valor correspondiente al numero de cuenta de una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Representa el método para modificar el numero de cuenta de una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     * @param accountNumber Representa el valor a asignar al atributo numero
     *                      de cuenta de una cuenta bancaria correspondiente a
     *                      una instancia de la clase BankAccount
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Representa el método para obtener el estado de cuenta de una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     * @return Un valor booleano correspondiente al estado de cuenta de una
     * cuenta bancaria correspondiente a una instancia de la clase BankAccount
     */
    public Boolean getActivated() {
        return activated;
    }

    /**
     * Representa el método para modificar el estado de cuenta de una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     * @param activated Representa el valor booleano a asignar al atributo
     *                  estado de cuenta de una cuenta bancaria
     *                  correspondiente a una instancia de la clase BankAccount
     */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    /**
     * Representa el método para obtener el saldo de cuenta de una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     * @return El valor correspondiente al saldo de cuenta de una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     */
    public float getBalance() {
        return balance;
    }

    /**
     * Representa el método para modificar el saldo de cuenta de una cuenta
     * bancaria correspondiente a una instancia de la clase BankAccount
     * @param balance Representa el valor a asignar al atributo
     *                  saldo de cuenta de una cuenta bancaria
     *                  correspondiente a una instancia de la clase BankAccount
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * Representa el método para obtener la información de un objeto de la
     * clase BankAccount por medio de un string con una estructura
     * definida
     * @return Un String con la información de una cuenta bancaria
     * correspondiente a una instancia de la clase BankAccount
     */
    @Override
    public String toString() {
        return "Información de cuenta bancaria:" + "\n" + person.toString() +
                "\nNumero de cuenta: " + accountNumber +
                "\nActivación: " + activated + "\nBalance: " + balance;
    }
}
