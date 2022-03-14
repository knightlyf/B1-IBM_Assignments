public class Task1 implements Runnable{
    String name;
    public Task1(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("Thread "+name);
    }
}
    