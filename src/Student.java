public class Student{
  String name;
  String surname;
  int id;
  static int lastID = 0;

  public Student(String name, String surname){
    this.name = name;
    this.surname = surname;
    this.id = lastID++;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", id=" + id +
            '}';
  }
}
