public class pattern13 {
  public static void main(String[] args) {
    int k = 1;
    int m = 2;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print("   ");
      }
      int l = k;
      for (int j = 0; j < i + 1; j++) {
        System.out.print(" " + (l--) + " ");
      }
      k++;
      int n = m;
      for (int j = 0; j < i; j++) {
        System.out.print(" " + (n++) + " ");
      }
      System.out.println();
    }
  }
}
