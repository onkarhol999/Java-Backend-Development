import java.util.Scanner;

public class DebitCardSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter card Number : ");
        int cardNo = sc.nextInt();
        System.out.println("Set Pin : ");
        int pin = sc.nextInt();

        int choice = 0;
        Card obj1 = new Card();
        User obj2 = new User(name, cardNo, pin);
        System.out.println("***********Welcome to Debit card system**********");
        System.out.println("Enter Your Pin");
        int userPin = sc.nextInt();
        if (!obj2.authenticate(userPin)) {
            System.out.println("Enter Correct Pin");
            return;
        }
        while (choice != 4) {
            showMenu();
            choice = sc.nextInt();
            showSwitchCases(choice, obj1, sc);
        }
    }

    public static void showMenu() {
        System.out.println("Welcome to Debit Card System!");
        System.out.println("\nMenu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void showSwitchCases(int choice, Card obj1, Scanner sc) {
        switch (choice) {
            case 1:
                int totalBalance = obj1.totalBankBalance();
                System.out.println();
                System.out.println("Your Total Bank Balance is : " + totalBalance);
                break;
            case 2:
                System.out.print("Enter the amount of money: ");
                int am = sc.nextInt();
                if (am > 0) {
                    obj1.deposit(am);
                    System.out.println("Deposit successful.");
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                break;
            case 3:
                System.out.print("Enter the amount of money: ");
                int amo = sc.nextInt();
                if (amo > 0) {
                    obj1.Withdraw(amo);
                } else {
                    System.out.println("Amount must be positive.");
                }
                break;
            case 4:
                break;
            default:
                break;
        }
    }
}
