package Classes;

import java.util.ArrayList;

public class Buy {
    private int buyId;
    public ArrayList<AdditionalFruitInformation> fruitList;
    public BankAccount originAccount;
    public BankAccount destinationAccount;

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

    public int getBuyId() {
        return buyId;
    }

    public void setBuyId(int buyId) {
        this.buyId = buyId;
    }

    public ArrayList<AdditionalFruitInformation> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<AdditionalFruitInformation> fruitList) {
        this.fruitList = fruitList;
    }

    public BankAccount getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(BankAccount originAccount) {
        this.originAccount = originAccount;
    }

    public BankAccount getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(BankAccount destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    @Override
    public String toString() {
        String message = purchasingProcess(fruitList);
        return "Compra " + buyId +
                "\nFrutas:\n \n" + fruitList.get(0).toString() +
                "\n \n" + fruitList.get(1).toString() + "\n" + message +
                "\nCuenta de Origen:\n" + originAccount +
                "\n \nCuenta de destino:\n" + destinationAccount;
    }

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
