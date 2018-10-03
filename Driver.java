public class Driver {
  public static void main(String[]args){

    BankAccount a = new BankAccount(3202.98, 100309, "cool");

    System.out.println("The ID of my bank account is " +a.getAccountID() + ". It has a balance of "+a.getBalance() + ".");
    System.out.println(a);
    a.setPassword("hi123");

    if(a.deposit(512.95)){
      System.out.println("Deposit success!");
    } else {
      System.out.println("Deposit failure");
    }

    System.out.println("My new balance is " + a.getBalance() + ".");

    if(a.deposit(-67.98)){
      System.out.println("Deposit success!");
    } else {
      System.out.println("Deposit failure");
    }

    if(a.withdraw(234.29) ){
      System.out.println("Withdrawal success!");
    } else {
      System.out.println("Withdrawal failure");
    }

    if(a.withdraw(5000.00) ){
      System.out.println("Withdrawal success!");
    } else {
      System.out.println("Withdrawal failure");
    }

    System.out.println("My new balance is " + a.getBalance() + ".");
  }
}
