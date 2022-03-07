import java.util.*;
public class Day5a {
    public static void main(String[] args){
        sop();
        palindrome1();
        lst();
        linked();
        
    }
    public static void sop(){
        String A = "   hello team  ";
        String a= A.trim();
        System.out.println();
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(3));
        System.out.println(a.indexOf("o"));
        System.out.println(a.length());
    }
    public static void lst(){
        List l = new ArrayList();
        l.add("hello");
        l.add(2);
        l.add(3.4);
        System.out.println(l);
        l.remove(2);
        l.remove("hello");
        System.out.println(l);
        System.out.println(l.contains("hello"));
        System.out.println(l.size());
        l.clear();
        System.out.println(l);
    }

    public static void palindrome(){
        String s = "madam";
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag==true){System.out.println("palindrome");}
        else{System.out.println("not palindrome");}

    }

    public static void palindrome1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();
        String pdm="";

        for(int i=s.length();i>0;i--)
            pdm = pdm + s.charAt(i-1);
        
        if(s.equals(pdm))
            System.out.println("palindrome");

        else
            System.out.println("not a palindrome");

    }

    public static void linked(){
        LinkedList x = new LinkedList();
        x.add("hello");
        x.addFirst("world");
        x.addLast("java");
        x.add(2,"python");
        x.add(7);
        System.out.println(x);
        x.removeFirst();
        x.removeLast();
        System.out.println(x);

    }
}
