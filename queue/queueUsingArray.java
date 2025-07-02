class queue {
  int arr[];
  int size;
  int rear = -1;

  queue(int size) {
    arr = new int[size];
    this.size = size;
  }

  public boolean isEmpty() {
    if (rear == -1) {
      return true;
    }
    return false;
  }

  public boolean isFull() {
    if (rear == size - 1) {
      return true;
    }
    return false;
  }

  public void add(int data) {
    if (isFull() == true) {
      System.out.println("queue is full");
      return;
    }
    rear++;
    arr[rear] = data;
    return;
  }

  public int remove() {
    if (isEmpty() == true) {
      System.out.println("queue is empty");
      return -1;
    }
    int data = arr[0];
    for (int i = 0; i <= rear; i++) {
      arr[i] = arr[i + 1];
    }
    rear--;
    return data;
  }

  public void print() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }
    for (int i = 0; i <= rear; i++) {
      System.out.println(arr[i]);
    }
    return;
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("queue is empty");
      return -1;
    }
    return arr[0];
  }
}

public class queueUsingArray {

  public static void main(String[] args) {
    queue q = new queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    // q.remove();
    System.out.println(q.peek());
    q.print();
  }
}
