public class pattern12 {
  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 5 - i; j++) {
        System.out.print("   ");
      }
      for (int j = 0; j < i + 1; j++) {
        System.out.print("   " + (i + 1) + "   ");
      }
      System.out.println();
    }
  }
}
