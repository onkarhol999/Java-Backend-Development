class MyAnotherThrad extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("MyAnotherThrad value of i : " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
