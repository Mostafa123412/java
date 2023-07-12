//Implement Class BankAccount with these specifications
//It holds the following data:
// account ID
// balance
//The following methods apply to this class:
// Constructor There are 2 constructors. The first sets the balance to a given
//value. The second is a no-argument constructor and it sets the
//balance to 0.
// Setters and getters These methods allow accessing the private data fields.
// withdraw withdraws an amount of money from the account if the balance
//is sufficient.
// deposit deposits an amount of money in the account

public class Task1 {

    public static void main(String[] args) {

        BankAccount bankAccount1 =new BankAccount();
        bankAccount1.withdraw(20);
        System.out.println("the balance for bankAccount1  = "+bankAccount1.getBalance());
        bankAccount1.deposit(100);
        System.out.println("the balance after deposit for bankAccount1 = "+bankAccount1.getBalance());
        bankAccount1.withdraw(40);
        System.out.println("the balance after withdraw for bankAccount1 = "+bankAccount1.getBalance());
        System.out.println();
        System.out.println();


        BankAccount bankAccount2 =new BankAccount(500);
        System.out.println("the balance for bankAccount2 = "+bankAccount2.getBalance());
        bankAccount2.deposit(100);
        bankAccount2.deposit(100);
        System.out.println("the balance after deposits for bankAccount2 = "+bankAccount2.getBalance());
        bankAccount2.withdraw(40);
        System.out.println("the balance after withdraw for bankAccount2 = "+bankAccount2.getBalance());




    }

}
