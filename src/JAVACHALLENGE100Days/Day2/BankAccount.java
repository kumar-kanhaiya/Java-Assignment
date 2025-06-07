package JAVACHALLENGE100Days.Day2;

public class BankAccount {
    int balance;
    public void deposit(int amount ){
        balance += amount;
        System.out.printf("%d is successfully deposit\n",amount);
        System.out.println("Thanks for Using ");
    }
    public void Withdraw(int amount ){
        if(amount > balance){
            System.out.println("No Balance");
        }
        else{
            System.out.printf("%d successfully withdraw" ,amount);
        }
    }

    public int getBalance() {
        return balance;
    }

    BankAccount(int balance ){
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount person1 = new BankAccount(500);
        person1.deposit(500);
        person1.Withdraw(2000);
        person1.Withdraw(800);
        System.out.println("\n"+person1.getBalance());
    }
}
