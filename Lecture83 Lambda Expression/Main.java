@FunctionalInterface
interface A {
    void show();
}

// This is the one way to create object of interface
// class B implements A {
// public void show() {
// System.out.println("In Show");
// }
// }

// Another way to create a anonymous class
public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In Show");
            }
        };
        obj.show();
    }
}

// In Java 8 there is feature called Lambda Expression to use the functional
// interface
public class Main {
    public static void main(String[] args) {
        A obj = () -> {
            System.out.println("In Show");
        };
        obj.show();
    }
}
