package Variable;

public class BankAccount {
    private String username;
    private String password;
    int accountNumber;
    public String bankName;


    void printBankName() {
        System.out.println(bankName);
    }
    void printUserName(){
        System.out.println(username);
    }
    void printAccountNumber(){
        System.out.println(accountNumber);
    }
}

