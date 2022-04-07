package Classes;

import java.time.LocalDate;

public class Person {
    private int personId;
    public String name;
    public String lastName1;
    public String lastName2;
    public LocalDate dateBirth;
    public float height;

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

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Identificación: " + personId + "\nNombre: " + name +
                "\nApellidos: " + lastName1 + ' ' + lastName2;
    }
}
