
////Implement Class BankAccount with these specifications
////It holds the following data:
//// account ID
//// balance
////The following methods apply to this class:
//// Constructor There are 2 constructors. The first sets the balance to a given
////value. The second is a no-argument constructor it sets the
////balance to 0.
//// Setters and getters These methods allow accessing the private data fields.
//// withdraw withdraws an amount of money from the account if the balance
////is sufficient.
//// deposit deposits an amount of money in the account
public class BankAccount {

    private int account_ID;
     private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
        balance=0;
    }

    public int getAccount_ID() {
        return account_ID;
    }

    public void setAccount_ID(int account_ID) {
        this.account_ID = account_ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void withdraw(double value){
        if (balance>=value){
            balance=balance-value;
            System.out.println("withdraw done");
        }else {
            System.out.println("balance is not sufficient ");
        }
    }

    public void deposit(int value){

            balance=balance+value;
            System.out.println("deposit done");
    }
}
