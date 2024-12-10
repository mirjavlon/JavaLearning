public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        isRetired = true;
        terminate("12/12/2025");
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double collectPay() {
         double payCheck = annualSalary / 12;
         double adjustedPay = (isRetired == true) ? 0.8 * payCheck : payCheck;
         return adjustedPay;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "isRetired=" + isRetired +
                "} " + super.toString();
    }
}
