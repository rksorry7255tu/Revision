
public class merge {
  public static void main(String[] args) {
    int arr[] = { 5, 4, 7, 2, 9, 1, 1 };
    divide(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void divide(int arr[], int start, int end) {
    if (start >= end) {
      return;
    }
    int mid = start + (end - start) / 2;
    divide(arr, start, mid);
    divide(arr, mid + 1, end);
    merge(arr, start, end, mid);
  }

  public static void merge(int arr[], int start, int end, int mid) {
    int merge[] = new int[end - start + 1];
    int ind1 = start;
    int ind2 = mid + 1;
    int x = 0;
    while (ind1 <= mid && ind2 <= end) {
      if (arr[ind1] <= arr[ind2]) {
        merge[x++] = arr[ind1++];
      } else {
        merge[x++] = arr[ind2++];
      }
    }
    while (ind1 <= mid) {
      merge[x++] = arr[ind1++];
    }
    while (ind2 <= end) {
      merge[x++] = arr[ind2++];
    }
    for (int i = 0, j = start; i < merge.length; j++, i++) {
      arr[j] = merge[i];
    }
  }
}
