class Count {
    private int count;
    public synchronized void increment(){
        count++;
    }
    public void getCount(){
        System.out.println(count);       
    }
}
public class Syncronization {
    public static void main(String[] args) throws InterruptedException {
        Count c1 = new Count();
        Thread t1 = new Thread(()->{
           for(int i = 0; i < 100 ; i++) c1.increment();
        });

        Thread t2 = new Thread(()->{
            for(int i = 0; i < 100; i++) c1.increment();
        });

        t1.start(); t2.start();
        t1.join();t2.join();

        c1.getCount();

    }
}
