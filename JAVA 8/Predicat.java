import java.util.function.Predicate;

public class Predicat{
    public static void main(String[] args) {
        Predicate<Integer> condGT = (x) -> x > 10;
        condGT.test(10);

        Predicate<Integer> condLT = (x) -> x < 20;
        condLT.test(-10);

        Predicate<Integer> even = (x) -> x % 2 == 0;

        System.out.println(condGT.and(condLT).test(15));
        System.out.println(condGT.or(condLT).test(45));

        System.out.println(even.test(7));
    }
    
}
