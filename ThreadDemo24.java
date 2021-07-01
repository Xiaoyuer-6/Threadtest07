package threadz_0627;

import static java.lang.Thread.yield;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-30
 * Time: 20:42
 */
public class ThreadDemo24 {
    public static final int maxSize = 1000;
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0; i <maxSize ; i++) {
                //yield();
                System.out.println("我是t1");

            }
        },"t1");
        t1.start();
        Thread t2 = new Thread(()->{
            for (int i = 0; i <maxSize ; i++) {
                System.out.println("我是t2");
            }
        },"t2");
        t2.start();
    }
}
