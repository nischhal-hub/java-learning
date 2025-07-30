class Multi extends Thread{
    public void run(){
        System.out.println("running...");       
    }
}
public class Threads {
    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
    }    
}
