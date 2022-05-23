package ar.com.ada.accessibility.access.modifiers;

public class Person {
    public String name;
    public String lastname;
    public Integer age;




    public Person (String name,String lastname,Integer age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;


    }


    public void showAttributeValues(){
        System.out.println("el nombre es "+name+" "+"el apellido es"+" "+lastname+" "+"la edad es"+" "+age);

    }
}
