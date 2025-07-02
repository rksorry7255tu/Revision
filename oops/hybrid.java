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
  public void three() {
    System.out.println("three");
  }
}

class four extends three {
  public void four() {
    System.out.println("four");
  }
}

public class hybrid {
  public static void main(String[] args) {
    two t2 = new two();
    t2.one();
    t2.two();

    four t4 = new four();
    t4.one();
    t4.three();
    t4.four();

  }

}
