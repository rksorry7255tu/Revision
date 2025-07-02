class student {
  String name;
  int age;

  // non-parameterised constructor
  student() {
    System.out.println("non-paramaterised constructor called:");
  }

  // parameterised constructor
  student(String name, int age) {
    System.out.println("parameterised constructor called;");
    this.name = name;
    this.age = age;
  }

  // copy constructor
  student(student s) {
    System.out.println("coppy constructor called");
    this.name = s.name;
    this.age = s.age;
  }

  public void printInfo() {

    System.out.println(this.name);
    System.out.println(this.age);
  }
}

public class constructor {
  public static void main(String[] args) {
    student s = new student();
    s.printInfo();
    student s1 = new student("Ravi Kumar", 20);
    s1.printInfo();
    student s2 = new student(s1);
    s2.printInfo();

  }
}
