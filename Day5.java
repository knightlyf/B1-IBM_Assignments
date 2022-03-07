import java.util.Scanner;

interface op{
    
    public int add(int a, int b);
    public int sub(int a, int b);
}


public class Day5  implements op {
    public void start(){
        System.out.println("car started");
    }
    public static void main(String args[]){
        //main method
        System.out.println(printMethod());
        int a=10,b=20;
        Day5 d = new Day5(); 
        System.out.println(d.add(a,b));
        System.out.println(d.sub(a,b));

    }
    
    public static String printMethod(){
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        return s;
    }

    public  int add(int a, int b){
        return a+b;
    }

    public  int sub(int a, int b){
        return a-b;
    }
}





