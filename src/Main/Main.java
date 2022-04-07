package Main;

import Classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(111111111, "Yeisson", "Vahos", "Cortes");
        System.out.println("Objeto clase persona\n" + "Persona 1\n" +
                person1.toString() + "\n");

        Person person2 = new Person(222222222, "Alberto", "Diaz", "Romero");
        System.out.println("Objeto clase persona\n" + "Persona 2\n" +
                person2.toString() + "\n");

        ContactInformation contactInformation1 =
                new ContactInformation(person1, "yvahosc@unal.edu.co",
                        "Av. 74A # 45-89");
        System.out.println("Objeto clase información de contacto\n" +
                "Persona 1\n" + contactInformation1.toString() + "\n");

        ContactInformation contactInformation2 =
                new ContactInformation(person2, "adiazr@xxxx",
                        "Av. 44A # 50-89");
        System.out.println("Objeto clase información de contacto\n" +
                "Persona 2\n" + contactInformation2.toString() + "\n");

        BankAccount bankAccount1 = new BankAccount(person1,123456789, true,
                100000);
        System.out.println("Objeto clase cuenta bancaria\n" +
                "Persona 1\n" + bankAccount1.toString() + "\n");

        BankAccount bankAccount2 = new BankAccount(person2,987654321, true,
                100000);
        System.out.println("Objeto clase cuenta bancaria\n" +
                "Persona 2\n" + bankAccount2.toString() + "\n");

        ArrayList colors = new ArrayList(2);
        colors.add("Rojo");
        colors.add("Verde");
        Fruit fruit1 = new Fruit("Manzana", 0.35f, colors);
        System.out.println("Objeto clase fruta\n" +
                "Fruta 1\n" + fruit1.toString() + "\n");

        Fruit fruit2 = new Fruit("Uva", 0.012f, colors);
        System.out.println("Objeto clase fruta\n" +
                "Fruta 2\n" + fruit2.toString() + "\n");

        AdditionalFruitInformation additionalFruitInformation1 =
                new AdditionalFruitInformation(fruit1, 6500, 3);
        System.out.println("Objeto clase información adicional de la fruta\n" +
                "Fruta 1\n" + additionalFruitInformation1.toString() + "\n");

        AdditionalFruitInformation additionalFruitInformation2 =
                new AdditionalFruitInformation(fruit2, 13500, 0);
        System.out.println("Objeto clase información adicional de la fruta\n" +
                "Fruta 2\n" + additionalFruitInformation2.toString() + "\n");

        ArrayList<AdditionalFruitInformation> fruitList = new ArrayList(2);
        fruitList.add(additionalFruitInformation1);
        fruitList.add(additionalFruitInformation2);
        Buy buy1 = new Buy(001, fruitList,bankAccount1, bankAccount2);
        System.out.println("Objeto clase compra\n" + buy1.toString() + "\n");

        verification(person1, person2, bankAccount1, bankAccount2,
                contactInformation1, contactInformation2, fruit1, fruit2,
                additionalFruitInformation1, additionalFruitInformation2, buy1);
    }

    public static void verification(Person person1, Person person2,
                                    BankAccount bankAccount1,
                                    BankAccount bankAccount2,
                                    ContactInformation contactInformation1,
                                    ContactInformation contactInformation2,
                                    Fruit fruit1, Fruit fruit2,
                                    AdditionalFruitInformation
                                            additionalFruitInformation1,
                                    AdditionalFruitInformation
                                            additionalFruitInformation2,
                                    Buy buy1)
    {
        System.out.println("Verificación clases creadas:\n");
        if ((person1.getClass() == Person.class) &
                (person2.getClass() == Person.class))
        {
            System.out.println("Persona 1 y persona 2 son de tipo: " +
                    Person.class);

            if ((bankAccount1.getClass() == BankAccount.class) &
                    (bankAccount2.getClass() == BankAccount.class))
            {
                System.out.println("Cuenta 1 y cuenta 2 son de tipo: " +
                        BankAccount.class);

                if ((contactInformation1.getClass() == ContactInformation.class)
                        & (contactInformation2.getClass() ==
                        ContactInformation.class))
                {
                    System.out.println("La información de contacto de las " +
                            "personas 1 y 2 son de tipo: " +
                            ContactInformation.class);

                    if ((fruit1.getClass() == Fruit.class) &
                            (fruit2.getClass() == Fruit.class))
                    {
                        System.out.println("Fruta 1 y fruta 2 son de tipo: " +
                                Fruit.class);

                        if ((additionalFruitInformation1.getClass() ==
                                AdditionalFruitInformation.class) &
                                (additionalFruitInformation2.getClass() ==
                                        AdditionalFruitInformation.class))
                        {
                            System.out.println("La información adicional de " +
                                    "las frutas 1 y 2 son de tipo: " +
                                    AdditionalFruitInformation.class);

                            if ((buy1.getClass() == Buy.class))
                            {
                                System.out.println("La compra 1 es de tipo: " +
                                        Buy.class + "\n");

                                System.out.println("Las clases requeridas " +
                                        "fueron creadas.");
                            }
                        }
                    }
                }
            }
        }
    }


}
