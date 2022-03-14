import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thrding {
    public static void main(String[] args){
        ChildDemo c = new ChildDemo();
        c.start();
        for(int i=0;i<10;i++){
            Thread.currentThread().setName("hiperf"+i);
            System.out.println("Main thread "+i);
            System.out.println("Current thread "+Thread.currentThread().getName());
            if(Thread.currentThread().getName().equals("hiperf5")){
                System.out.println("hiperf5");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println("Exception occured");
                }
            }
        }
        System.out.println(Thread.activeCount());

    }

    public static void executioner(){
        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int j=0;j<10;j++){
            Runnable t = new Task1(""+j);
            es.execute(t);
        }
    }
}


