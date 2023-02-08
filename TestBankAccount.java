// worked with Jared P

public class TestBankAccount {
  
  public static void main(String[] args) {
    
    BankAccount account1 = new BankAccount(50, 50);
    System.out.println(account1.getCheckingBalance());
    System.out.println(account1.getSavingsBalance());
    System.out.println(BankAccount.getNumberOfAccounts());
    System.out.println(account1.getAccountNumber());
    System.out.println(account1.checkingDeposit(50));
    System.out.println(account1.savingsDeposit(50));
    System.out.println(account1.totalMoney());
  }
}
