public class Person {
  private String name;
  private int age;
  private String color;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  Person(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }
}