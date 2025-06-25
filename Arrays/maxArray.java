import java.util.Arrays;

public class maxArray {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    // int max = Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // if (arr[i] < min) {
    // min = arr[i];
    // }
    // }
    // System.out.println(max);
    // System.out.println(min);
    int max = Arrays.stream(arr).max().getAsInt();
    int min = Arrays.stream(arr).min().getAsInt();
    int sum = Arrays.stream(arr).sum();
    System.out.println(max);
    System.out.println(min);
    System.out.println(sum);

    // char to Ascii Value

    // System.out.println((int) 'A');
    // System.out.println((int) 'Z');
    // System.out.println((int) 'a');
    // System.out.println((int) 'z');
  }
}
