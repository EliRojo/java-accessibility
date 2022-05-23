package ar.com.ada.accessibility.access.modifiers;

 public class Dog {
  String breed;
  String color;

   public Dog(String breed, String color){
   this.breed = breed;
   this.color = color;

  }

  public void showAttributeValues() {
   System.out.println("la raza del perro es"+" "+breed+" "+"el color es "+" "+color);
  }
 }
