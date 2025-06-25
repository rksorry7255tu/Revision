public class spiral {
  public static void main(String[] args) {
    int arr[][] = { { 1, 5, 7, 9, 10, 11 }, { 6, 10, 12, 13, 20, 21 }, { 9, 25, 29, 30, 32, 41 },
        { 15, 55, 59, 63, 68, 70 }, { 40, 70, 79, 81, 95, 105 } };

    int lu = 0;
    int ld = arr.length - 1;
    int ul = 0;
    int ur = arr[0].length - 1;
    while (ul != ur && lu != ld) {

      for (int i = ul; i <= ur; i++) {
        System.out.print(arr[lu][i] + " ");
      }
      lu++;
      for (int i = lu; i <= ld; i++) {
        System.out.print(arr[i][ur] + " ");
      }
      ur--;
      for (int i = ur; i >= ul; i--) {
        System.out.print(arr[ld][i] + " ");
      }
      ld--;
      for (int i = ld; i >= lu; i--) {
        System.out.print(arr[i][ul] + " ");
      }
      ul++;
    }
    for (int i = ul; i <= ur; i++) {
      System.out.print(arr[lu][i] + " ");
    }

  }
}
