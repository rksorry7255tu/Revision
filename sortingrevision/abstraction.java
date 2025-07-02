abstract class one {
  abstract void one();
}

class two extends one {
  public void one() {
    System.out.println("one in two");
  }
}

class three extends one {
  public void one() {
    System.out.println("one in three");
  }
}

public class abstraction {
  public static void main(String[] args) {
    three t3 = new three();
    t3.one();
  }
}
