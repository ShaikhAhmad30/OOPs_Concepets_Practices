package Polymorphism;
class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return  a + b;
    }

    public int add(int a , int b, int c){
        return  a + b + c;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args){

        Calculator c = new Calculator();

        System.out.println(c.add(2,5));
        System.out.println(c.add(2.6, 5.7));
        System.out.println( c.add(3,6,7));
    }
}
