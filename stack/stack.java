
public class stack {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head = null;

  public void push(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      System.out.println("element is added:");
      return;
    }
    newNode.next = head;
    head = newNode;
    System.out.println("element is added:");
    return;
  }

  public void print() {
    if (head == null) {
      System.out.println("staCK is empty:");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public int pop() {
    if (head == null) {
      System.out.println("stack is empty:");
      return -1;
    }
    int data = head.data;
    head = head.next;
    System.out.println("element is deleted:");
    return data;
  }

  public int peek() {
    if (head == null) {
      System.out.println("stack is empty:");
      return -1;
    }
    return head.data;
  }

  public static void main(String[] args) {
    stack s = new stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.pop();
    s.push(4);
    s.print();
    int peek = s.peek();
    System.out.println(peek);
  }
}
