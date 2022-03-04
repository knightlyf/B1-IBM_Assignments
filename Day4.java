import java.util.Scanner;

public class Day4 {
    public static void main(String[] args){
        //reverse string
        
        String txt= "HELLO";
        for (int i=txt.length()-1;i>=0;i--){
            System.out.println(txt.charAt(i));
        }

        int money = 200, pizza = 105;
        if(money >= pizza)
            System.out.println("You can buy pizza");
        else
            System.out.println("You can't buy pizza");
        
        String one = "PIZZA", two = "cheese";
        System.out.println(one.toLowerCase()+" "+two.toUpperCase());
        prime(3);
        even();
        int a=34,b=56;
        System.out.println("Max of "+a+" and "+ "b is: "+Math.max(a, b));
        System.out.println("Addition of "+a+" and "+ "b is: "+addnum(a, b));
    }

    public static void prime(int x){
        //check if number is prime
        int count = 0;
        if (x==1 || x==0)
            System.out.println(x+" is neither prime nor composite");
        else{
            for (int i=1;i<=x;i++){
                if (x%i==0)
                    count++;
            }
            if (count==2)
                System.out.println("Number is prime");
            else
                System.out.println("Number is not prime");
        }
    }

    public static void even(){
        //check if number is even
        System.out.println("Enter the no: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if(x%2==0){
            System.out.println(x+" is Even");
        }
        else{
            System.out.println(x +" is Odd");
        }
        s.close();
    }

    public static int addnum(int a, int b){
        //add two numbers
        return a+b;
    }
}
