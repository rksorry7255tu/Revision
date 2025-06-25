public class pattern9 {
  public static void main(String[] args) {
    int i = 1;
    for (int j = 0; j < 6; j++) {
      for (int k = 0; k < j; k++) {
        System.out.print(" " + i++ + " ");
      }
      System.out.println();
    }
  }
}
