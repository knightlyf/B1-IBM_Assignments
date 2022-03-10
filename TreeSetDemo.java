import java.util.*;
public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet<String> ts = new TreeSet<>();
        ts.add("hello");
        ts.add("world");
        ts.add("java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        for(int i=0;i<3;i++){
            ts.add(sc.nextLine());
        }
        sc.close();
        System.out.println("First word according to alphabetical order is "+ts.first());
        System.out.println("Last word according to alphabetical order is "+ts.last());

        ArrayList<Object> al = new ArrayList<Object>();
        al.add("hello");
        al.add("world");
        al.add("java");

        Iterator<Object> itr = al.iterator();
        while(itr.hasNext()){
            if(itr.next().equals("hello")){
                itr.remove();
            }
        }
    }

}
