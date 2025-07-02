class one {
  public void one() {
    System.out.println("one");
  }
}

class two extends one {
  public void two() {
    System.out.println("two");
  }
}

class three extends one {
  public static void three() {
    System.out.println("three");
  }
}

public class hierarchical {
  public static void main(String[] args) {
    two t2 = new two();
    t2.one();
    t2.two();

    three t3 = new three();
    t3.one();
    t3.three();
  }
}
