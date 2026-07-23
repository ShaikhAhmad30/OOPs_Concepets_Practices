package Polymorphism;

class Payment{
    public void pay(){
        System.out.println("Processing Payment");
    }
}

class CreditCard extends Payment{

    @Override
    public void pay(){
        System.out.println(" Paid using Credit Card");
    }
}

class Upi extends Payment{
    @Override
    public void pay(){
        System.out.println(" Paid using UPI");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args){
        Payment p;

        p = new CreditCard();
        p.pay();

        p = new Upi();
        p.pay();

    }
}
