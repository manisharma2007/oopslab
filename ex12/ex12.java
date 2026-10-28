import java.util.Scanner;
public class MobileRecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, mobile;
        int choice, amount = 0;

        System.out.print("Enter customer name: ");
        name = sc.nextLine();

        System.out.print("Enter mobile number: ");
        mobile = sc.nextLine();

        System.out.println("\n--- Mobile Recharge Plans ---");
        System.out.println("1. Rs.199 - 28 Days");
        System.out.println("2. Rs.299 - 56 Days");
        System.out.println("3. Rs.399 - 84 Days");

        System.out.print("Select a plan (1-3): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                amount = 199;
                break;
            case 2:
                amount = 299;
                break;
            case 3:
                amount = 399;
                break;
            default:
                System.out.println("Invalid plan selected!");
                sc.close();
                return;
        }

        System.out.println("\n--- Recharge Details ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Recharge Amount: Rs." + amount);
        System.out.println("Recharge Successful!");

        sc.close();
    }
}


