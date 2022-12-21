package UdemyOOP;

public class Hesap {
    private String name;
    private String password;
    private int balance;

    public Hesap(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance+=amount;
        System.out.println("New balance "+ balance);
    }
    public void withdraw(int amount) {
        if(amount>balance) {
            System.out.println("You do not have enough balance");
            System.out.println("Your balance is "+ balance);
        }
        else {
            balance-=amount;
            System.out.println("New balance is "+ balance);
        }
    }


}






