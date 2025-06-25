import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array:");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the nos:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < size; i++) {
      System.out.println(arr[i]);
    }
  }
}
