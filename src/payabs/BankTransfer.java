package payabs;

public class BankTransfer extends payment{
  @Override
  void paymentmethod() {
    System.out.println("YOU HAVE SELECTED BANK TRANSFER AS A PAYMENT METHOD ");
  }
}
