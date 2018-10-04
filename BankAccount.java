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

  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean withdraw(double amount) {
    if (amount <= balance && amount >= 0) {
      balance -= amount;
      return true;
    } else {
      return false;
    }
  }

  private boolean authenticate(String password) {
    return (password.equals(this.password));
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password)) {
      return(this.withdraw(amount) && other.deposit(amount));
    } else {
      return false;
    }
  }
}
