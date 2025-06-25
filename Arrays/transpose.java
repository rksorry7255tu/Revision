import java.util.ArrayList;

public class transpose {
  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
    int ans[][] = new int[3][2];

    int temp[] = new int[arr.length * arr[0].length];
    // ArrayList<Integer> list = new ArrayList<>();
    int m = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        temp[m++] = arr[i][j];
      }
    }
    int n = 0;
    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[0].length; j++) {
        ans[i][j] = temp[n++];
      }
    }
    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans[0].length; j++) {
        System.out.print(ans[i][j] + " ");
      }
      System.out.println();
    }
    // for (int i = 0; i < temp.length; i++) {
    // System.out.println(temp[i]);
    // }
  }
}
