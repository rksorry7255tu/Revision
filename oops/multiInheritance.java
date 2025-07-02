class one {
  public static void one() {
    System.out.println("one");
  }
}

class two extends one {
  public static void two() {
    System.out.println("two");
  }
}

class three extends two {
  public static void three() {
    System.out.println("three");
  }
}

public class multiInheritance {
  public static void main(String[] args) {
    three t = new three();
    t.one();
    t.two();
    t.three();
  }
}
