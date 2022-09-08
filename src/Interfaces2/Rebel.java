package Interfaces2;

//clasa ce implementeaza interfata Person
public class Rebel implements Person{
    private int age;
    private String name;

    //constructor; e obligatoriu de instantiat clasa pt a crea obiect
    public Rebel(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //rescriere/implementare metode din interfata
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
