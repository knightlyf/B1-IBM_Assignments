abstract class ukn{
    protected String warn="Warning";
}

//public abstract void Ukn2();

class Vehicle{

    protected String brand = "Dodge";
    public void honk(){
        System.out.println("HONK HONK");
    }
}
public class Day3b extends Vehicle{
    public static void main(String[] args){
        Vehicle d = new Vehicle();
        d.honk();
        System.out.println(d.brand);

        Day3b  d3 = new Day3b();
        d3.honk();
        
        //ukn u = new ukn();        cant create object of abstract class
    }
    public void honk(){
        System.out.println("HONK HONK HONK");
    }

}

class Day3c extends Day3a{
    Day3a d = new Day3a();
    
    public static void main(String[] args){
        
        Day3a d = new Day3a();
        System.out.println(d.getName()+" "+d.getAge());
        d.setName("Varun");
        d.setAge(23);
        System.out.println(d.getName()+" "+d.getAge());
    }
}


    

