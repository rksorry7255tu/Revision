
public class quick {
  public static void main(String[] args) {

    int arr[] = { 4, 3, 5, 2, 7, 1 };
    Quick(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

  public static void Quick(int arr[], int start, int end) {
    if (start < end) {
      int pivot = partition(arr, start, end);
      Quick(arr, start, pivot - 1);
      Quick(arr, pivot + 1, end);
    }
  }

  public static int partition(int arr[], int start, int end) {
    int piv = arr[start];
    int i = start - 1;
    for (int j = start; j < end; j++) {
      if (arr[j] < piv) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    i++;
    int temp = arr[i];
    arr[i] = piv;
    arr[end] = temp;
    return i;

  }
}
