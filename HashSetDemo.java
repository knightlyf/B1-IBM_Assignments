import java.util.*;
public class HashSetDemo {
    public static void main(String[] args){
        // HashSet hs = new HashSet();
        // hs.add("hello");
        // hs.add(7);
        // hs.add(false);
        // System.out.println(hs);

        // LinkedHashSet lhs = new LinkedHashSet();
        // lhs.add("hello");
        // lhs.add("world");
        // lhs.remove(1);
        // System.out.println(lhs);
        
        // SortedSet sh = new TreeSet();
        // sh.add(275);
        // sh.add(200);
        // sh.add(300);
        // sh.add(98);
        // //sh.add("hello");
        // System.out.println(sh);
        
        evenodd();
        smallest();
        leap();
        vowel();
        rev();

    }

    public static void evenodd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(n%2==0)
            System.out.println(n+" is even");
        else
            System.out.println(n+" is odd");

    }

    public static void smallest(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 3 numbers:");
        // String[] input = sc.nextLine().split(" ");
        // int n = Integer.parseInt(input[0]);
        // int m = Integer.parseInt(input[1]);
        // int k = Integer.parseInt(input[2]);
        //int n=sc.nextInt();
        //int m=sc.nextInt();
        //int k=sc.nextInt();
        int n=10;
        int m=90;
        int k=14;
    
        if(n<m && n<k)
            System.out.println(n+" is smallest");
        else if(m<n && m<k)
            System.out.println(m+" is smallest");
        else
            System.out.println(k+" is smallest");
        
        //largest
        if(n>m && n>k)
            System.out.println(n+" is largest");
        else if(m>n && m>k)
            System.out.println(m+" is largest");
        else
            System.out.println(k+" is largest");

        // SortedSet sm= new TreeSet();
        // for(int i=0;i<3;i++){    
        //     n= sc.nextInt();
        //     sm.add(n);
        // }
        // sc.close();
        // System.out.println("Largest no is: "+sm.last());
        // System.out.println("Smallest no is: "+sm.first());
        
    }

    public static void leap(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a year");
        // int n = sc.nextInt();
        // sc.close();
        int n=2004;
        if(n%4==0 && n%100!=0 || n%400==0)
            System.out.println(n+" is leap year");
        else
            System.out.println(n+" is not leap year");
    }

    public static void vowel(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a character");
        // char ch = sc.next().charAt(0);
        // sc.close();
        char ch='a';
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println(ch+" is vowel");
        else
            System.out.println(ch+" is not vowel");

    }

    public static void rev(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string");
        // String s = sc.nextLine();
        // sc.close();
        String s = "hello";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev = rev + s.charAt(i);
        System.out.println(rev);
    }
}
