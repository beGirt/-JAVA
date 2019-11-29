package producer;

public class TestMain {
    public static void main(String[] args) {
        Producer p1 = new Producer();
        Producer p2 = new Producer();
        Consumer c1 = new Consumer();
        Consumer c2 = new Consumer();
        Consumer c3 = new Consumer();
        Consumer c4 = new Consumer();
        p1.start();
//        p2.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
