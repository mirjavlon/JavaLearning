//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SalariedEmployee Jim = new SalariedEmployee("Jim Watkins", "12/09/1987", 77001, "23/02/2003", 120000,false );

        System.out.println(Jim);
        Jim.retire();
        System.out.println(Jim.collectPay());
    }
}