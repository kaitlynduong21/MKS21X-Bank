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


  public static void main(String[]args){

		BankAccount a = new BankAccount(3202.98, 100309, "cool");
    System.out.println(a);

  }


}
