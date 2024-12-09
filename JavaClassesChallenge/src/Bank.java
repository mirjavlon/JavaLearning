public class Bank {

    private int accountNumber;
    private double accountBalance;
    private String CustomerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void depositOut(double sum) {

        if(sum > getAccountBalance()) {
            System.out.println("Declined");
        } else {
            setAccountBalance(getAccountBalance() - sum);
            System.out.println("$" + sum + " has been withdrawn");
        }

        System.out.println("Total balance is: "+"$"+Math.round(getAccountBalance() * 100.0) / 100.0);
    }

    public void depositIn(double sum) {
        setAccountBalance(getAccountBalance() + sum);
        System.out.println("$" + sum + " has been deposited");

        System.out.println("Total balance is: "+"$"+Math.round(getAccountBalance() * 100.0) / 100.0);
    }
}
