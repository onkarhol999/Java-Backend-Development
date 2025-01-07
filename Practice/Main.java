class Main {

    public static void main(String[] args) {
        Company obj = new Company();
        Producer t1 = new Producer(obj);
        Consumer t2 = new Consumer(obj);
        t1.start();
        t2.start();
    }
}