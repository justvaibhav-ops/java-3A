package payabs;

public class main {
    static void main(String args[]) {
//        UPI upi=new UPI();
//        creditcard cc=new creditcard();
//        BankTransfer bt=new BankTransfer();
        payment upi=new UPI();
        payment bt=new BankTransfer();
        payment cc= new creditcard();
        upi.payment_stat();
        upi.paymentmethod();
        cc.paymentmethod();
        bt.paymentmethod();

    }
}
