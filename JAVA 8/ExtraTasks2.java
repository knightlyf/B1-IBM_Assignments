import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraTasks2{
    public static void main(String[] args){
        List<String> cityList = Arrays.asList("chennai", "mumbai", "bangalore", "", "delhi", "chicago");
        cityList.stream().map(p->p.toUpperCase()).forEach(System.out::println);

        cityList.stream().filter(p->p.length()>6).forEach(System.out::println);

        cityList.stream().filter(p->p.startsWith("c")).forEach(System.out::println);

        cityList.stream().filter(p->p.contains("ai")).forEach(System.out:: println);

        cityList.stream().map(p->p+" metro").forEach(System.out::println);

        cityList.stream().sorted().forEach(System.out::println);

        System.out.println(cityList.stream().filter(p->p.startsWith("c")).count());

        System.out.println(cityList.stream().findFirst());

        System.out.println(cityList.stream().filter(x->x.isEmpty()).count());

        cityList.stream().filter(x->!x.isEmpty()).forEach(System.out::println);

        List<Integer> numList = new ArrayList<>();
        for(int i=1;i<26;i++){
            numList.add(i);
        }
        int sum = numList.stream().mapToInt(x->x).sum();
        System.out.println(sum);
    }
}