package Inheritance;

// Parent Class
class Person{
    public void displayName(){
        System.out.println("Name: Ahmad");
    }
}

// Child class
class Employees extends Person{
    public void displayEmpId(){
        System.out.println("Employess Id: 1234");
    }
}

// sub Child class
class Manager extends Employees{
    public void mangeteam(){
        System.out.println("Managing Development Team");
    }
}



public class MultilevelInheritanceExample {
    public static void main(String[] args){

        Manager m = new Manager();
        m.displayName();
        m.displayEmpId();
        m.mangeteam();
    }
}
