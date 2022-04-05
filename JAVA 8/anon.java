
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.Predicate;

public class anon{
    public static void main(String[] args){
        Consumer<String> s1 =(str) -> System.out.println(str.toLowerCase());
        s1.accept("HELLO");
        Consumer<String> s2 =(str) -> System.out.println(str.toUpperCase());
        s2.accept("From the other side");
        Consumer<Integer> s3 =(num) -> System.out.println(num);
        s3.accept(64);
        s1.andThen(s2).accept("Hello");

        List<String> list = Arrays.asList("Hello","World","Hello","World");
        List<String> list2 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);

        int total = IntStream.range(1,10).sum();
        System.out.println(total);

        List<Integer> list3 = new ArrayList<Integer>();
        for(int i=0;i<25;i++){
            list3.add(i);
        }

        //---------------------EXTRA----------------------------
        //anon a = new anon();
        eval(list3,num -> true);
        System.out.println("\n\nList of numbers greater than 10");
        eval(list3,num -> num>10);
        System.out.println("\n\nList of numbers divisible by 5");
        eval(list3,num -> num%5==0);

        MathOperation addition = (num1,num2) -> num1+num2;
        MathOperation subtraction = (num1,num2) -> num1-num2;
        MathOperation remainder = (num1,num2) -> num1%num2;

        System.out.println("\nRemainder of two numbers: "+anon.operate(20,10, remainder));
        System.out.println("Addition of two numbers: "+anon.operate(10,450, addition));
        System.out.println("Subtraction of two numbers: "+anon.operate(20,10, subtraction));
    }

    private static void eval(List<Integer> list3, Predicate<Integer> predicate) {
        for(Integer num:list3){
            if(predicate.test(num)){
                System.out.print(num+" ");
            }
        }
    }

    interface MathOperation{
        int operation(int num1,int num2);
    }

    private static int operate(int num1,int num2, MathOperation mathOperation){
        return mathOperation.operation(num1,num2);
    }


}