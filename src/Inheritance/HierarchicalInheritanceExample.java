package Inheritance;

class Account{
    public void accountDetails(){
        System.out.println("Account Holder Name: Ahmad");
    }
}
class SavingAccount extends Account{
    public void interestRate(){
        System.out.println("Interest rate is 5%");
    }
}

class CurrentAccount extends Account{
    public void overdraft(){
        System.out.println("Overdraft facility Available");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args){

        SavingAccount s1 = new SavingAccount();
        s1.accountDetails();
        s1.interestRate();

        System.out.println();

        CurrentAccount c1 = new CurrentAccount();
        c1.accountDetails();
        c1.overdraft();
    }
}
