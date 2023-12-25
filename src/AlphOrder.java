import java.util.Arrays;
public class AlphOrder {
    public static String alphabeticalOrder(String word){
        String[] array = word.split("");
        Arrays.sort(array);
        return String.join("",array);
    }
    public static void main(String[] args) {
        System.out.println(alphabeticalOrder("string"));
    }
}