//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank account = new Bank();
        account.setAccountBalance(400.95);
        account.setAccountNumber(134513241);
        account.setEmail("example@gmail.com");
        account.setCustomerName("John Black");
        account.setPhoneNumber("+998909574819");

        account.depositIn(200.34);
        account.depositOut(300.23);
        account.depositOut(1000.0);
    }
}