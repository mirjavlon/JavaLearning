public class Worker {

    protected String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int birthYear = Integer.parseInt(birthDate.substring(6));
        int endYear = Integer.parseInt(endDate.substring(6));
        int age = endYear - birthYear;
        return age;
    }

    public double collectPay() {
       return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
