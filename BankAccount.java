public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double a, int b, String c) {
    balance = a;
    accountID = b;
    password = c;
  }

  public String toString() {
    return (accountID + "\t" + balance);
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String str) {
    password = str;
  }

  public boolean deposit(double depo) {
    if (depo >= 0.0) {
      balance += depo;
      return true;
    } else {
      return false;
    }
  }

  public boolean withdrawal(double money) {
    if (money <= balance) {
      balance -= money;
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[]args){

		BankAccount a = new BankAccount(3202.98, 100309, "cool");
    System.out.println("The ID of my bank account is " +a.getAccountID() + ". It has a balance of "+a.getBalance() + ".");
    System.out.println(a);
    a.setPassword("hi123");
    System.out.println(a.deposit(412.09));
    System.out.println("My new balance is " + a.getBalance() + ".");
    System.out.println(a.deposit(-52.09));
    System.out.println(a.withdrawal(412.09));
    System.out.println("My new balance is " + a.getBalance() + ".");
    System.out.println(a.withdrawal(5000.00));

  }


}
