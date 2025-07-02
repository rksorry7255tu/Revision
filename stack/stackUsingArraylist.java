import java.util.*;

class stack {
  ArrayList<Integer> list = new ArrayList<>();

  public void push(int data) {
    list.add(data);
    System.out.println("element is added:");
  }

  public int pop() {
    if (list.isEmpty() == true) {
      System.out.println("stack is empty:");
      return -1;
    }
    int data = list.get(list.size() - 1);
    list.remove(list.size() - 1);
    return data;
  }

  public int peek() {
    if (list.isEmpty() == true) {
      return -1;
    }
    return list.get(list.size() - 1);
  }

  public void print() {
    System.out.println(list);
  }
}

public class stackUsingArraylist {

  public static void main(String[] args) {
    stack s = new stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.pop();
    s.print();
  }
}
