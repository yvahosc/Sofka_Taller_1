package Classes;

import java.time.LocalDate;

public class ContactInformation {
    public Person person;
    private String email;
    private String address;

    public ContactInformation(Person person, String email, String address) {
        this.person = person;
        this.email = email;
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Información de contacto:" + "\n" + person.toString() +
                "\nEmail: " + email + "\nDirección: " + address;

    }
}
