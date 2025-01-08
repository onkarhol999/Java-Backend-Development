public class User {
    private String name;
    private int cardNo;
    private int pin;

    public User(String name, int cardNo, int pin) {
        this.name = name;
        this.cardNo = cardNo;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public int getCardNumber() {
        return cardNo;
    }

    public boolean authenticate(int userPin) {
        return pin == userPin;
    }
}
