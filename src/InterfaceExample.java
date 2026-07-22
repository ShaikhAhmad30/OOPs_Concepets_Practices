interface  Payment{
    void pay(double amount);

}

class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid $"+ amount+ " using credit card");
    }
}

class PayPalPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid $ "+ amount + " using PayPal");
    }
}



public class InterfaceExample {
    public static void main(String[] args){

        CreditCardPayment c1 = new CreditCardPayment();
        c1.pay(100);

        PayPalPayment p1 = new PayPalPayment();
        p1.pay(200);
    }
}
