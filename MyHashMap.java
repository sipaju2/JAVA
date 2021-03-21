import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class MyHashMap {

    public static void main(String args[]) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        // Adding elements to HashMap
        hmap.put(0, "Love");
        hmap.put(1, "Hate");
        hmap.put(2, "Charity");
        hmap.put(3, "Passion");
        hmap.put(4, "Friends");
        hmap.put(5, "Ambition");
        hmap.put(6, "Fight");
        hmap.put(7, "Grateful");
        hmap.put(8, "Thankful");
        hmap.put(9, "Resilence");

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry myEntry = (Map.Entry) iterator.next();
            System.out.println("The Number is: " + myEntry.getKey() + " and the Values is: " + myEntry.getValue());
        }

    }
}
