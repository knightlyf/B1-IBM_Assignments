import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtra {

    static List<User> users =Arrays.asList(
        new User("John", "Doe", 10),
        new User("Jane", "Doe", 20),
        new User("Will", "Smith", 30),
        new User("Jane", "Smith", 40)
    );
    public static void main(String[] args) throws IOException{
        IntStream.range(1, 11).forEach(System.out::println);

        //Skip the first 2 elements -------------------------------
        IntStream.range(1,7).skip(2).forEach(System.out::print);

        //Sum of all elements -------------------------------------
        System.out.println("\nsum is:"+IntStream.range(1,7).sum());

        //Average of squares of all elements ----------------------
        System.out.println(IntStream.range(1,7).map(i->i*i).average());

        //Start with t
        Stream.of("A","Z","t","e","s","t").filter(x -> x.startsWith("t"));

        //Contains a from file
        Set<String> list = Files.lines(Paths.get("data.txt")).filter(x -> x.contains("a")).collect(Collectors.toSet());
        System.out.println(list);

        //Stream from List
        List<String> list2 = Arrays.asList("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot").
        stream().filter(x -> x.startsWith("C")).collect(Collectors.toList());
        System.out.println(list2);

        //comparator
        List<User> li1 = users.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
        System.out.println(li1);


    }
}
