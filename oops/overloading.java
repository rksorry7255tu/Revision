class student {
  String name;
  int age;

  student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void printInf(String name) {
    System.out.println(name);
  }

  public static void printInf(int age) {
    System.out.println(age);
  }

  public static void printInf(String name, int age) {
    System.out.println(name);
    System.out.println(age);
  }
}

public class overloading {
  public static void main(String[] args) {
    student s = new student("ravi", 20);
    s.printInf(10);
    s.printInf("Ravi Kumar");
    s.printInf("Ravi Kumar", 100);
  }
}
