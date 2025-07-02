class one {
  public static void one() {
    System.out.println("one in one");
  }
}

class two extends one {
  public static void one() {
    System.out.println("one in two");
  }
}

public class overriding {
  public static void main(String[] args) {
    two t = new two();
    t.one();
  }
}
