package Classes;

import java.time.LocalDate;

public class BankAccount {
    public Person person;
    private int accountNumber;
    protected Boolean activated;
    private float balance;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Información de cuenta bancaria:" + "\n" + person.toString() +
                "\nNumero de cuenta: " + accountNumber +
                "\nActivación: " + activated + "\nBalance: " + balance;
    }
}
