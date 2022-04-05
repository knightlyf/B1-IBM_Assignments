import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiComsumerExample {
    public static void main(String[] args){
        BiConsumer<Integer, Integer> bc1 = (x,y) -> System.out.println(x+y);
        bc1.accept(9,7);
        BiConsumer<Integer, Integer> bc2 = (x,y) -> System.out.println(x*y);
        bc2.accept(9,7);
        bc1.andThen(bc2).accept(9,7);

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        BiConsumer<List<Integer>, List<Integer>> bc3 = (x,y) -> {
            if(l1.size()==l2.size())
                System.out.println("Lists are of same size");
            else
                System.out.println("Lists are of different size");
            
        };
        bc3.accept(l1,l2);
    }   
}
