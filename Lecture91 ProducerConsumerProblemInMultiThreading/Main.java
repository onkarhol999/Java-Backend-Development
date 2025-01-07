public class Main {
    public static void main(String[] args) {
        Company obj = new Company();
        Producer pro = new Producer(obj);
        Consumer con = new Consumer(obj);
        pro.start();
        con.start();
    }
}
