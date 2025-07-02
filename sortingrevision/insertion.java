
public class insertion {
  public static void main(String[] args) {
    int arr[] = { 4, 5, 2, 6, 3, 7, 8, 2 };
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] >= curr) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = curr;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
