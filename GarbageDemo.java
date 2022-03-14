import java.util.GregorianCalendar;

public class GarbageDemo extends GregorianCalendar{
    public static void main(String args[]){
        GarbageDemo g = new GarbageDemo();
        String s = "TIME:";
        System.out.println(s+g.getTime());
        s = null;
        
        g.finalize();
        System.gc();
        

    }
    @Override
    protected void finalize(){
        System.out.println("Finalize");
    }
}