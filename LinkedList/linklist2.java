
public class linklist2 {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      System.out.println("element added:");
      return;
    }
    newNode.next = head;
    head = newNode;
    System.out.println("element added:");
    return;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      System.out.println("element added:");
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    System.out.println("element added:");
    return;
  }

  public void print() {
    if (head == null) {
      System.out.println("list is empty:");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public int deleteFirst() {
    if (head == null) {
      System.out.println("list is empty:");
      return -1;
    }
    int data = head.data;
    head = head.next;
    System.out.println("element daleted:");
    return data;
  }

  public int deleteLast() {
    if (head == null) {
      System.out.println("list is empty:");
      return -1;
    }
    Node temp = head;
    Node prev = null;
    int data;
    while (temp.next != null) {
      prev = temp;
      temp = temp.next;
    }
    data = temp.data;
    prev.next = null;
    System.out.println("element deleted:");
    return data;
  }

  public void reverseList() {
    if (head == null) {
      System.out.println("list is empty:");
      return;
    }
    Node prev = head;
    Node curr = head.next;
    Node next = curr.next;
    while (curr.next != null) {
      curr.next = prev;
      prev = curr;
      curr = next;
      next = curr.next;
    }
    curr.next = prev;
    prev = curr;
    curr = next;

    head.next = null;
    head = prev;
  }

  public boolean search(int data) {
    if (head == null) {
      System.out.println("list is empty:");
      return false;
    }
    Node temp = head;
    while (temp != null) {
      if (temp.data == data) {
        System.out.println("true");
        return true;
      }
      temp = temp.next;
    }
    System.out.println("false");
    return false;
  }

  public static void main(String[] args) {
    linklist2 list = new linklist2();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addLast(4);
    list.addLast(5);
    list.addLast(6);
    list.deleteFirst();
    list.deleteLast();
    list.print();
    list.reverseList();
    list.print();
    list.search(4);
  }
}
