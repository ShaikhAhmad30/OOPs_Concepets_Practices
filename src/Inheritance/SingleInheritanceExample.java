package Inheritance;
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog is barking");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args){

        Animal a1 = new Animal();
        a1.eat();
        Dog d1 = new Dog();
        d1.eat();
        d1.sound();
    }
}
