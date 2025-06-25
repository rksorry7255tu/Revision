import java.util.*;

public class SearchX {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the sixe of arr:");
    int size = sc.nextInt();
    System.out.println("Enter the arr nos:");
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the no to search in the arr:");
    int x = sc.nextInt();
    for (int i = 0; i < size; i++) {
      if (arr[i] == x) {
        System.out.println(i);
      }
    }
  }
}
