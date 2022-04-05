import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        a.add(0);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(25);
        a.add(15);
        a.add(5);
        for(Integer result: a){
            if(result%2==0)
                list.add(result);
            
        }
        System.out.println(list);
        //------------------------------------------------------
        List<Integer> even=a.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> g10 = a.stream().filter(i -> i>10).collect(Collectors.toList());
        System.out.println(g10);

        List<Integer> add10 = a.stream().map(i -> i+10).collect(Collectors.toList());
        System.out.println(add10);

        List<Integer> sorted = a.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        List<Person> persons = PersonRepository.getAll();
        List<Person> filtered = persons.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());

        filtered.stream().forEach(System.out::println); //method reference
        //------------------------------------------------------
        List<String> lower = persons.stream().map(p->p.getName().toLowerCase()).collect(Collectors.toList());
        System.out.println(lower);

        List<String> upper = persons.stream().map(p->p.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);

        List<Person> filtered2 = persons.stream().filter(p->p.getName().length()>5).collect(Collectors.toList());
        System.out.println(filtered2);

        List<Double> increment = persons.stream().map(p->p.getSalary()+5000).collect(Collectors.toList());
        System.out.println(increment);

        ///Filter the null value from tis 
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
        List<String> filtered3 = language.filter(s->s!=null).collect(Collectors.toList());
        System.out.println(filtered3);
 
    }
}
