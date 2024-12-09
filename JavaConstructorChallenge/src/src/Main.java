//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer("John Black",231.32, "johnblack@gmail.com");
        Customer customer3 = new Customer("Simon Riley", "simonriley@gmail.com");
        
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());

        System.out.println(customer2.getEmail());
        System.out.println(customer3.getName());
    }
}