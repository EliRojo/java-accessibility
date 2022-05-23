package ar.com.ada.accessibility.access.modifiers;

public class Bank {
    public Integer numberAccount ;
    public String amount ;

    public Bank(Integer numberAccount, String amount){
        this.numberAccount = numberAccount;
        this.amount = amount;
    }

    public void showAttributeValues(){
        System.out.println("el numero de la cuenta es "+" "+numberAccount+" "+" el monto es"+" "+amount);

    }
}

