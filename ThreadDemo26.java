package threadz_0627;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-07-01
 * Time: 18:17
 */




/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-07-01
 * Time: 17:57
 */
public class ThreadDemo26 {
    static class  Counter{
        private int num = 0;
        //任务执行的次数
        private final  int maxSize = 100000;
        public void incrment(){
            for (int i = 0; i <maxSize ; i++) {
                num++;

            }

        }
        public void decrment(){
            for (int i = 0; i <maxSize ; i++) {
                num--;
            }
        }
        public int getNum(){
            return num;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
            counter.incrment();
        });
        t1.start();
      Thread t2 = new Thread(()->{
          counter.decrment();
      });
       t2.start();
       t1.join();
       t2.join();
        System.out.println("最终结果:"+counter.getNum());
    }
}
