package lesson2;

//同时运行多个线程，等所有执行完毕，再执行main之后的方法
//先打印0-19，随即同时打印，全部打印后打印main
public class MultiThreadFinishThenDoMain {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for(int i = 0;i < 20;i++){
            final int j = i;
            Thread t = new Thread(()->{
                System.out.println(j);
            });
            t.start();
            threads[i] = t;
        }
        for(int i = 0;i < 20;i++){
            threads[i].join();
        }
        System.out.println("main");
    }
}
