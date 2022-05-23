package ar.com.ada.accessibility.access.modifiers;

import java.util.PrimitiveIterator;

public class MyContanst {
    public static final double PI = 3.14;
    public Integer counter;

    public MyContanst( Integer counter){

        this.counter = counter;
    }
    public void showAttributeValues(){
        System.out.println("el valor de PI es :"+" "+PI);

}

}
