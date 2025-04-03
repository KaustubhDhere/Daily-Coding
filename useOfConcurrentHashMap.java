import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * This question is asked in J P Morgan company
 * To overcome the Concurrent modification exception
 * here is the solution
 */
public class useOfConcurrentHashMap {

    public static void main(String[] args) {

//      Map<String, String> map= new HashMap<>(); //Because of this line Concurrent modification exception caused
        Map<String, String> map = new ConcurrentHashMap<>();

        map.put("Delhi", "Capital city of india");

        map.put("Dhaka", "Capital city of bangladesh");

        map.put("Berlin", "Capital city of germany");


        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
            map.remove("Delhi");
        }
        System.out.println("\n Size after Removing the value :" + map.size());
    }

}
