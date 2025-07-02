class student {
  String name;
  private int age;

  student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  private void printInf(String name, int age) {
    System.out.println(this.name);
    System.out.println(this.age);
  }

  public void printInf(String name) {
    System.out.println(this.name);
    System.out.println(this.age);
  }
}

public class encapsulation {
  public static void main(String[] args) {
    student s = new student("Ravi", 20);
    // s.printInf("ravi", 20);
    s.printInf("Ravi");
  }

}
