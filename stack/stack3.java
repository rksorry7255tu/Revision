import java.util.*;

public class stack3 {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    System.out.println(s);
    System.out.println(s.pop());
    System.out.println(s);
  }
}
