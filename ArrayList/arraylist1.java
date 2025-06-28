import java.util.*;

public class arraylist1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(4);
    list.add(3);
    System.out.println(list);
    System.out.println(list.get(2));
    list.add(1, 1);
    System.out.println(list);
    list.set(1, 12);
    System.out.println(list);
    System.out.println(list.size());
    for (int x : list) {
      System.out.println(x);
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    Collections.sort(list);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);

    int arr[] = { 1, 2, 30, 4, 5 };
    Arrays.sort(arr);
    for (int i : arr) {
      System.out.println(i);
    }

  }
}
