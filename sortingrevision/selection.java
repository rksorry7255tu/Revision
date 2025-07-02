
public class selection {
  public static void main(String[] args) {
    int arr[] = { 5, 34, 7, 2, 9, 4, 5, 6, 3 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[j] <= arr[i]) {
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
