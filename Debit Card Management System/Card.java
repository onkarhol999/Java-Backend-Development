
public class Card {

    int bankBalance;

    public void deposit(int amount) {
        if (amount > 0) {
            bankBalance += amount;
            System.out.println("Successfully deposited : " + amount);
        }
    }

    public int totalBankBalance() {
        return bankBalance;
    }

    public boolean Withdraw(int amount) {
        if (amount > 0 && amount <= bankBalance) {
            bankBalance -= amount;
            System.out.println();
            System.out.println("Successfully withdrew: " + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
    }
}
