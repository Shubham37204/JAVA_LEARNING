class Student {
    String name;
    int age;
    Student() {
        
    }
    Student(String name) {
        this.name = name;
    }
}
void main() {
    List<String> names = Arrays.asList("Navin", "Harsh", "John");
    List<Student> students = new ArrayList<>();
    students = names.stream()
            .map(Student::new)
            .toList();

    System.out.println(students);

}

//A constructor reference is similar,
// but instead of referring to an existing method,
// we refer to an existing constructor.
//ClassName::new

//() -> new Student()
//        ↓
//"Create a Student"
//
//Student::new
//        ↓
//"Use Student's constructor to create it"

//Constructor reference is a shorthand way of referring to a constructor using ClassName::new. It is used where a compatible functional interface is expected and is equivalent to a lambda expression that creates an object using that constructor.

