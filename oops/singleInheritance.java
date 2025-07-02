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

public class singleInheritance {
  public static void main(String[] args) {
    two t = new two();
    t.one();
    t.two();
  }
}
