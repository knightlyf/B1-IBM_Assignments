import java.util.HashMap;

public class MapDemo {
    public static void main(String args[]){
        HashMap<Character,Integer> h = new HashMap<>();
        String s = "Varun Vinod";
        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(c[i])){
                h.put(c[i],h.get(c[i])+1);
            }
            else{
                h.put(c[i],1);
            }
            
        }
        System.out.println(h);

        HashMap<String,String> h1 = new HashMap<>();
        h1.put("name","Varun");
        h1.put("age","22");
        h1.put("city","Mumbai");
        System.out.println(h1.keySet());
        System.out.println(h1.values());
        h1.remove("city");
        System.out.println(h1.size());
    }
}
