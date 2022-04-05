import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPerson {
    static List<Person> personList = PersonRepository.getAll();
    static BiConsumer<String,String> genders =(name,gender) -> System.out.println("Name:"+name+"\nHobbies:"+gender);
    public static void main(String args[]){
        fetchGender();
    }
    static void fetchGender(){
        personList.forEach(per->{
            genders.accept(per.getName(),per.getGender());
        });
    }
}
