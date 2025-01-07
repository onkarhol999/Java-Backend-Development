
class UserThread extends Thread {
    public void run() {
        System.out.println("User Thread run....");
    }
}

public class ThreadOP {
    public static void main(String[] args) {
        System.out.println("Program started....");
        int x = 3 + 5;
        System.out.println("Sum is : " + x);
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current thread is : " + tname);
        t.setName("MyThread");
        String tname2 = t.getName();
        System.out.println("New Thead Name is : " + tname2);

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(t.getId());

        // Going to start user define thread
        UserThread t1 = new UserThread();
        t1.start();
        System.out.println("Program Ended....");
    }
}
