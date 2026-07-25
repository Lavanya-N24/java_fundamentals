class BankAccount{
    String accountName;
    int accountNumber;
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void setbalance(double balance){
        if(balance<0){
            System.out.println("no balance in your account");
        }
        else{
            this.balance=balance;
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.accountName="lavanya";
        account.accountNumber=456;
        account.setbalance(1000);
        System.out.println("Account Name: "+account.accountName);
        System.out.println("Account Number: "+account.accountNumber);
        System.out.println("Balance: "+account.getBalance());
    }
}