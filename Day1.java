
import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) throws Exception {
        int chocolate = 10;
        long biscuit = 20L;
        float cake = 3.14f;
        double pie = 3.143548754d;
        char letter = 'a';
        boolean isHappy = false;
        System.out.println("After eating \n"+chocolate+" chocolates,\n"+biscuit+" biscuits,\n"+cake+" cakes,\n"+pie+" pies \nand reading "+letter+" letter,\nI'm happy="+isHappy);
        int arr[] = new int[10];
        String str = "Hello      elephant";
        System.out.println("Array length is "+arr.length);
        System.out.println("Array is "+Arrays.toString(arr));
        System.out.println(str.charAt(0));
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.indexOf("e"));
        /*
        String word ="java";            //1. OK
        String Word = " comp";          //2. OK
        String word@  = "java string";  //3. not OK
        String word12 = "java string";  //4. OK
        String 12word = "java string";  //5. not OK
        String int = "java";            //6. not OK
        String *java = "java";          //7. not OK
        String symbol$ = "100 dollars"; //8. OK
        String word ="java";            //9. OK
        String word = " comp";          //10. OK
        String word_ ="java";           //11.OK
        String word-   ="java is here"; //12.not OK
        String capital; = "delhi";      //13.not OK */
    }
}
/**/