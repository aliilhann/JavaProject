package UdemyOOP;

public class Account {
    private String hesap;
    private double bakiye;
    private String name;
    private String email;
    private String phoneNumber;



    public void deposit(double amount) {
        bakiye+=amount;
        System.out.println("New bakiye "+ bakiye);
    }
    public void withdraw(double amount) {
        if(amount>1500) {
            System.out.println("You cannot withdraw more than 1500 in one day");
        }
        if(bakiye<amount) {
            System.out.println("You do not have enough money. You have "+ bakiye);
        }else {
            bakiye-=amount;
            System.out.println("New bakiye "+ bakiye);
        }
    }

    public String getHesap() {
        return hesap;
    }

    public void setHesap(String hesap) {
        this.hesap = hesap;
    }

    public double getAmount() {
        return bakiye;
    }

    public void setAmount(double amount) {
        this.bakiye = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
