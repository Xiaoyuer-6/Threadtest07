package threadz_0627;




    /**
     * Created with IntelliJ IDEA.
     * Description:
     * User: HuYu
     * Date: 2021-07-01
     * Time: 17:57
     */
    public class ThreadDemo25 {
    static class  Counter{
        int num = 0;
        private final int maxSize = 10000;
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
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.incrment();
        counter.decrment();
        System.out.println("最终结果"+counter.getNum());
    }
}
