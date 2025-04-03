import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Alisha", "eve", "bob", "Rohan", "kartik", "tom");


        List<String> stringGreaterThan3 = list.stream().filter(name -> name.length() > 3).collect(Collectors.toList());

        System.out.println(stringGreaterThan3);
    }
}
