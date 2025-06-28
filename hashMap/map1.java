import java.util.*;

public class map1 {
  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(1, 10);
    map.put(2, 20);
    map.put(3, 30);
    System.out.println(map);
    System.out.println(map.containsKey(1));
    System.out.println(map.get(1));
    System.out.println(map.get(4));

    // for (Map.Entry<Integer, Integer> e : map.entrySet()) {
    // System.out.println(e.getKey() + " " + e.getValue());
    // }
    System.out.println(map.keySet());
    System.out.println(map.values());
    for (int x : map.keySet()) {
      System.out.println(x);
    }
    System.out.println(map);
    map.remove(1);
    System.out.println(map);
  }
}
