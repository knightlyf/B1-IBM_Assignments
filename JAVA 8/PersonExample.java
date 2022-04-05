import java.util.List;
import java.util.function.Consumer;

public class PersonExample {
    static List<Person> personlist = PersonRepository.getAll();
    static Consumer<Person> c1 =(per) -> System.out.println(per);
    static Consumer<Person> c2 =(per) -> System.out.println(per.getName().toLowerCase());
       
    public static void main(String[] args){
        
        personlist.forEach(c1);
        personlist.forEach(c2);
        personlist.forEach(c1.andThen(c2));

        conditonal();
    }

    private static void conditonal() {
        //male height > 140
        personlist.forEach(per->{
            if(per.getGender().equals("Male") && (per.getHeight()>140)){
                c1.andThen(c2).accept(per);
            }
        });
    }
}

