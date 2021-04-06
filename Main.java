import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<Person>();
    people.add(new Person("Evan", 18, "blue"));
    people.add(new Person("A", 87, "pink"));
    people.add(new Person("B", 13, "yellow"));
    people.add(new Person("C", 55, "black"));
    people.add(new Person("D", 4, "green"));

    try {
      FileWriter fileWriter = new FileWriter("data.txt");
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      for (Person person : people) {
        bufferedWriter.write(person.getName());
        bufferedWriter.newLine();
        bufferedWriter.write(Integer.toString(person.getAge()));
        bufferedWriter.newLine();
        bufferedWriter.write(person.getColor());
        bufferedWriter.newLine();
        bufferedWriter.flush();
      }
      bufferedWriter.close();
    }
    catch(IOException e) {
      System.out.println(e.toString());
    }

    try {
      FileReader fileReader = new FileReader("data.txt");
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String name;
      String age;
      String color;
      while (bufferedReader.ready()) {
        name = bufferedReader.readLine();
        age = bufferedReader.readLine();
        color = bufferedReader.readLine();
        System.out.printf("%-10s%-10s%-10s\n", name, age, color);
      }
      bufferedReader.close();
    }
    catch(IOException e) {
      System.out.println(e.toString());
    }
  }
}