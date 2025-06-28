
public class linkedlist1 {
  class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head = null;
  int size = 0;

  // add-first,last
  void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      size++;
      System.out.println("Element added");
      return;
    }
    newNode.next = head;
    head = newNode;
    size++;
    System.out.println("Element added");
  }

  // add last
  void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      size++;
      System.out.println("Element added");
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    size++;
    System.out.println("Element added");
  }

  // remove-first,last
  int removeFirst() {
    int data = -1;
    if (head == null) {
      System.out.println("list is empty");
      return data;
    }
    data = head.data;
    head = head.next;
    System.out.println("element removed fron first:");
    size--;
    return data;
  }

  // remove last
  int removeLast() {
    int data = -1;
    if (head == null) {
      System.out.println("least is empty");
      return data;
    }

    Node temp = head;
    Node prev = null;
    while (temp.next != null) {
      prev = temp;
      temp = temp.next;
    }
    data = temp.data;
    prev.next = null;
    size--;
    System.out.println("Element removed from last");
    return data;
  }

  // print list
  void printList() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  // list size
  int size() {
    if (head == null) {
      return 0;
    }
    return size;
  }

  // search an element
  boolean search(int data) {
    if (head == null) {
      System.out.println("list is empty");
      return false;
    }
    Node temp = head;
    if (temp.data == data) {
      return true;
    }
    while (temp.next != null) {
      temp = temp.next;
      if (temp.data == data) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    linkedlist1 list = new linkedlist1();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);
    list.addLast(4);
    // list.removeFirst();
    // list.removeLast();
    list.printList();
    System.out.println(list.size());
    System.out.println(list.search(5));

  }
}
