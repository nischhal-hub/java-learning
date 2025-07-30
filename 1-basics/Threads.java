//by extending Thread class
class Multi extends Thread{
    public void run(){
        System.out.println("running...");       
    }
}

//by extending Runnable class

class Multi1 implements Runnable{
    public void run(){
        System.out.println("message");      
    }
}
public class Threads {
    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
        Multi1 m1 = new Multi1();
        Thread t2 = new Thread(m1);
        t2.start();

    }    
}
