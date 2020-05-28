package lesson2;

public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            System.out.println("Thread Baby");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
        t.join(1000);
        System.out.println("main");
    }
}
