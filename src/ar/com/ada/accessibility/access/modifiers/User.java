package ar.com.ada.accessibility.access.modifiers;

public class User {
    protected String nickName;
    protected String password;


    protected User(String nickName,String password){
        this.nickName = nickName;
        this.password = password;
    }
    protected void showAttributeValues(){
        System.out.println("el usuario es "+" "+nickName+" la contraseña es"+" "+password);
    }

}
