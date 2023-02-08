// worked with Jared P
public class BankAccount {

  // Class attributes (members)
  private double checkingBalance;
  private double savingsBalance;
  private static int numberOfAccounts;
  private int accountNumber;
  

  // Class contructor
  public BankAccount(double checkingBalance, double savingsBalance) {
    numberOfAccounts++;
    this.checkingBalance += checkingBalance;
    this.savingsBalance += savingsBalance;
    this.accountNumber = generateAccountNumb();
  }

  // ----------Class Methods---------
  public double getCheckingBalance() {
    return this.checkingBalance;
  }

  public void setCheckingBalance(double checkingBalance) {
    this.checkingBalance = checkingBalance;
  }

  public double getSavingsBalance() {
    return this.savingsBalance;
  }

  public void setSavingsBalance(double savingsBalance) {
    this.savingsBalance = savingsBalance;
  }

  public static int getNumberOfAccounts() {
    return numberOfAccounts;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  private int generateAccountNumb() {
    return 123456789;
  }

  public double checkingDeposit(double userDeposit){
    return this.checkingBalance += userDeposit;
  }

  public double savingsDeposit(double userDeposit){
    return this.savingsBalance += userDeposit;
  }

  public double totalMoney(){
    return this.checkingBalance + this.savingsBalance;
  }

}