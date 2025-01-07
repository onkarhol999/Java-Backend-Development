public class Company {
    int n;
    boolean Turn = false;

    synchronized public void produce_item(int n) {
        if (Turn) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        Turn = true;
        notify();
    }

    synchronized public int consume_item() {
        if (!Turn) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Consumed : " + this.n);
        Turn = false;
        notify();
        return this.n;
    }
}
