import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindUniqueNumber {

    public static int unique(Integer[] arr) {

//        HashMap<Integer, Integer> hashmap = new HashMap<>();
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> countNum : map.entrySet()) {
            if (countNum.getValue() == 1) {
                return countNum.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 5, 7, 2, 5, 8, 6, 4, 8, 6}; // 7 and 2 are unique

        int uniqueNumber = unique(arr);

        System.out.println("uniqueNumber = " + uniqueNumber);

    }

}
