package producer;

public class Consumer extends Thread {
    public void run(){
        while (true){
            this.consume();
        }
    }

    public void consume(){
        Warehourse.getInstance().remove();
        System.out.println("消费者在消费");
        try {
            Thread.sleep(300);      //休眠 300 毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
