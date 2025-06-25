public class pattern8 {
  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < i + 1; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}
