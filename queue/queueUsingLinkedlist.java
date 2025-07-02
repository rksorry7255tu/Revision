
public class queueUsingLinkedlist {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  static Node head = null;
  static Node tail = null;

  public void add(int data) {
    Node newNode = new Node(data);
    if (tail == null) {
      tail = head = newNode;
      return;
    }
    tail.next = newNode;
    tail = tail.next;
    return;
  }

  public int remove() {
    if (head == null) {
      System.out.println("queue is empty");
      return -1;
    }
    int data = head.data;
    head = head.next;
    return data;
  }

  public int peek() {
    if (head == null) {
      System.out.println("queue is empty:");
      return -1;
    }
    return head.data;
  }

  public void print() {
    if (tail == null) {
      System.out.println("Queue is empty:");
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println(temp.data);
    System.out.println();
  }

  public static void main(String[] args) {
    queueUsingLinkedlist q = new queueUsingLinkedlist();
    q.add(1);
    q.add(2);
    q.add(3);
    q.print();
    q.remove();
    q.print();
    System.out.println(q.peek());

  }
}
