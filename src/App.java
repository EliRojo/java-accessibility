import ar.com.ada.accessibility.access.modifiers.*;

public class App {
    public static void main (String[] args){


        Dog rulo = new Dog ("caniche","marron");
        rulo.showAttributeValues();
        Bank elizabeth = new Bank(1234,"$150");
        elizabeth.showAttributeValues();
        Person eli = new Person("Elizabeth","Rojo",28);
        eli.showAttributeValues();
        User elirojo = new User("elirojo","luna");
        elirojo.showAttributeValues();
        MyContanst cuenta = new MyContanst(1234);
        cuenta.showAttributeValues();










    }
}
