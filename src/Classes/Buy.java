package Classes;

import java.util.ArrayList;

/**
 * Representa la clase Buy y su información
 * @autor Yeisson Augusto Vahos Cortes
 */
public class Buy {
    /**
     * Representa el número de identificación de una compra que corresponde
     * a una instancia de la clase Buy
     */
    private int buyId;

    /**
     * Representa una lista de objetos de la clase AdditionalFruitInformation
     * (una fruta y su información adicional) que pertenecen a una compra
     * que corresponde a una instancia de la clase Buy
     */
    public ArrayList<AdditionalFruitInformation> fruitList;

    /**
     * Representa un objeto de la clase BankAccount (una cuenta bancaria y su
     * información) desde la cual se realiza el pago de una compra que
     * corresponde a una instancia de la clase Buy
     */
    public BankAccount originAccount;

    /**
     * Representa un objeto de la clase BankAccount (una cuenta bancaria y su
     * información) a la cual se realiza el pago de una compra que
     * corresponde a una instancia de la clase Buy
     */
    public BankAccount destinationAccount;

    /**
     * Crea una instancia de la clase Buy
     * @param buyId Representa el número de identificación de una compra
     *              correspondiente a la instancia de la clase Buy que se
     *              está creando
     * @param fruitList Representa una lista de objetos de la clase
     *                  AdditionalFruitInformation (una fruta y su
     *                  información) que pertenecen a una compra
     *                  correspondiente a la instancia de la clase Buy que se
     *                  está creando
     * @param originAccount Representa un objeto de la clase BankAccount (una
     *                      cuenta bancaria y su información) desde la cual se
     *                      realiza el pago de una compra correspondiente a
     *                      la instancia de la clase Buy que se está creando
     * @param destinationAccount Representa un objeto de la clase BankAccount
     *                           (una cuenta bancaria y su información) a la
     *                           cual se realiza el pago de una compra
     *                           correspondiente a la instancia de la clase
     *                           Buy que se está creando
     */
    public Buy(
            int buyId,
            ArrayList<AdditionalFruitInformation> fruitList,
            BankAccount originAccount,
            BankAccount destinationAccount)
    {
        this.buyId = buyId;
        this.fruitList = fruitList;
        this.originAccount = originAccount;
        this.destinationAccount = destinationAccount;
    }

    /**
     * Representa el método para obtener el número de identificación de una
     * compra correspondiente a una instancia de la clase Buy
     * @return El valor correspondiente al número de identificación de una
     * compra correspondiente a una instancia de la clase Buy
     */
    public int getBuyId() {
        return buyId;
    }

    /**
     * Representa el método para modificar el número de identificación de una
     * compra correspondiente a una instancia de la clase Buy
     * @param buyId Representa el valor a asignar al atributo numero de
     *              identificación de una compra correspondiente a una
     *              instancia de la clase Buy
     */
    public void setBuyId(int buyId) {
        this.buyId = buyId;
    }

    /**
     * Representa el método para obtener la lista de objetos de la clase
     * AdditionalFruitInformation (una fruta y su información) que pertenecen
     * a una compra correspondiente a una instancia de la clase Buy
     * @return Una lista de objetos de la clase AdditionalFruitInformation
     * (una fruta y su información) que pertenecen a una compra
     * correspondiente a una instancia de la clase Buy
     */
    public ArrayList<AdditionalFruitInformation> getFruitList() {
        return fruitList;
    }

    /**
     * Representa el método para modificar la lista de objetos de la clase
     * AdditionalFruitInformation (una fruta y su información) que pertenecen
     * a una compra correspondiente a una instancia de la clase Buy
     * @param fruitList Representa la lista de objetos de la clase
     *                  AdditionalFruitInformation (una fruta y su
     *                  información) a asignar al atributo fruitList de una
     *                  compra correspondiente a una instancia de la clase Buy
     */
    public void setFruitList(ArrayList<AdditionalFruitInformation> fruitList) {
        this.fruitList = fruitList;
    }

    /**
     * Representa el método para obtener el objeto de la clase BankAccount
     * (una cuenta bancaria y su información) desde la cual se realiza el
     * pago de una compra correspondiente a una instancia de la clase Buy
     * @return Un objeto de la clase BankAccount (una cuenta bancaria y su
     * información) desde la cual se realiza el pago de una compra
     * correspondiente a una instancia de la clase Buy
     */
    public BankAccount getOriginAccount() {
        return originAccount;
    }

    /**
     * Representa el método para modificar el objeto de la clase BankAccount
     * (una cuenta bancaria y su información) desde la cual se realiza el
     * pago de una compra correspondiente a una instancia de la clase Buy
     * @param originAccount Representa el objeto de la clase BankAccount (una
     *                      cuenta bancaria y su información) a asignar al
     *                      atributo originAccount, cuenta desde la cual se
     *                      realiza el pago de una compra correspondiente a
     *                      una instancia de la clase Buy
     */
    public void setOriginAccount(BankAccount originAccount) {
        this.originAccount = originAccount;
    }

    /**
     * Representa el método para obtener el objeto de la clase BankAccount
     * (una cuenta bancaria y su información) a la cual se realiza el pago de
     * una compra correspondiente a una instancia de la clase Buy
     * @return Un objeto de la clase BankAccount (una cuenta bancaria y su
     * información) a la cual se realiza el pago de una compra
     * correspondiente a una instancia de la clase Buy
     */
    public BankAccount getDestinationAccount() {
        return destinationAccount;
    }

    /**
     * Representa el método para modificar el objeto de la clase BankAccount
     * (una cuenta bancaria y su información) a la cual se realiza el
     * pago de una compra correspondiente a una instancia de la clase Buy
     * @param destinationAccount Representa el objeto de la clase BankAccount
     *                           (una cuenta bancaria y su información) a
     *                           asignar al atributo destinationAccount, cuenta
     *                           a la cual se realiza el pago de una compra
     *                           correspondiente a una instancia de la
     *                           clase Buy
     */
    public void setDestinationAccount(BankAccount destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    /**
     * Representa el método para obtener la información de un objeto de la
     * clase Buy por medio de un string con una estructura definida
     * @return Un String con la información de una compra correspondiente a
     * una instancia de la clase Buy
     */
    @Override
    public String toString() {
        String message = purchasingProcess(fruitList);
        return "Compra " + buyId +
                "\nFrutas:\n \n" + fruitList.get(0).toString() +
                "\n \n" + fruitList.get(1).toString() + "\n" + message +
                "\nCuenta de Origen:\n" + originAccount +
                "\n \nCuenta de destino:\n" + destinationAccount;
    }

    /**
     * Representa el método para actualizar el saldo de las cuentas que se
     * utilizan en el proceso de pago de una compra correspondiente a una
     * instancia de la clase Buy
     * @param fruitList Representa la lista de objetos de la clase
     *                  AdditionalFruitInformation (una fruta y su
     *                  información) que pertenecen a una compra
     *                  correspondiente a una instancia de la clase Buy
     * @return Un String con el valor total a pagar por una compra
     * correspondiente a una instancia de la clase Buy
     */
    public String purchasingProcess(
            ArrayList<AdditionalFruitInformation> fruitList)
    {
        float pay = fruitList.get(0).getNumber() * fruitList.get(0).getPrice();
        float newBalanceOriginAccount = originAccount.getBalance() - pay;
        if (newBalanceOriginAccount > 0) {
            originAccount.setBalance(newBalanceOriginAccount);
            float newBalanceDestinationAccount =
                    destinationAccount.getBalance() + pay;
            destinationAccount.setBalance(newBalanceDestinationAccount);
        }
        return "\nValor a pagar: " + pay + " COP\n";
    }
}
