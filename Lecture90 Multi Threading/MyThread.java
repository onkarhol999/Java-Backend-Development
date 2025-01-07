
class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value of i : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread thread1 = new Thread(t1);
        thread1.start();
        MyAnotherThrad t2 = new MyAnotherThrad();
        t2.start();
    }
}
