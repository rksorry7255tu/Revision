import java.util.*;

public class tdarray1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows:");
    int row = sc.nextInt();
    System.out.println("Enter the no of colms:");
    int cols = sc.nextInt();
    int arr[][] = new int[row][cols];
    System.out.println("Enter the nos in the 2d Array:");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter the no to find in the matrix:");
    int x = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == x) {
          System.out.println("index-X=" + i + " Index-y=" + j);
        }
      }
    }
  }

}
