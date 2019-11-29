package producer;

public class Producer extends Thread {

    @Override
    public void run() {
        while (true) {
            produce();
        }
    }

    public void produce(){
        Warehourse.getInstance().add();
        System.out.println("生产者在生产");
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
