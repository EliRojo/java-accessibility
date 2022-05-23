import ar.com.ada.accessibility.access.modifiers.Bank;
import ar.com.ada.accessibility.access.modifiers.Dog;
import ar.com.ada.accessibility.access.modifiers.Person;
import ar.com.ada.accessibility.access.modifiers.User;

public class App {
    public static void main (String[] args){

        User elirojo = new User("elirojo","luna");
        elirojo.showAttributeValues();
        Dog rulo = new Dog ("caniche","marron");
        rulo.showAttributeValues();
        Bank elizabeth = new Bank(1234,"$150");
        elizabeth.showAttributeValues();








    }
}
