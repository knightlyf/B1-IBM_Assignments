import java.util.Scanner;

class Car{
    String color = "red";
    int seats;
    String drive;
    final String type = "sedan";     //cannot change value

    Car(){
        seats = 5;
        drive = "fwd";
    }

    public void start(){
        System.out.println("Car Started");
    }
}

public class Day3 {
    public static void main(String[] args){
        System.out.println(namer());
        double a = 2;
        double b = 3;
        System.out.println(mathfunc(a, b));
        Car ford = new Car();
        ford.color = "green";
        //ford.type = "hatchback";
        System.out.println(ford.color +" "+ford.type);
        p1();
        Day3 d = new Day3();
        d.p2();   //bcoz not
        
    }

    public static double mathfunc(double a, double b){
        int num=11;
        double dnum=11.11d;
        System.out.println("--------Math Functions start--------");
        System.out.println(Math.abs(dnum));
        System.out.println(Math.ceil(dnum));
        System.out.println(Math.floor(dnum));
        System.out.println(Math.max(num,dnum));
        System.out.println(Math.min(num,dnum));
        System.out.println(Math.log(num));
        System.out.println(Math.exp(num));
        System.out.println("--------Math Functions end--------");
        return Math.pow(a,b);
    }

    private static String namer(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.next();
        s.close();
        return name;
    }

    public static void p1(){
        System.out.println("p1");
    }

    public void p2(){
        System.out.println("p2");
    }
}
