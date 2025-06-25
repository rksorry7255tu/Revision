public class secondLargestEl {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 1, 1, 1 };
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secMax = max;
        max = arr[i];
      }
      if (arr[i] >= secMax && arr[i] < max) {
        secMax = arr[i];
      }
    }
    if (secMax == Integer.MIN_VALUE) {
      secMax = -1;
    }
    System.out.println(max);
    System.out.println(secMax);
  }
}
