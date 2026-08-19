import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    //comparison logic of Student
    //	public int CompareTo(Student that)
    //	{
    //	return 0;
    //		if(this.age >that.age)
    //			return 1;
    //		else
    //			return -1;
    //	}
}

void main() {

    //case1:-
    //    List<Integer> nums= new ArrayList<>();
    //    nums.add(43);
    //    nums.add(31);
    //    nums.add(72);
    //    nums.add(29);

    //comparable is a functional interface
    // it provide the logic for comparing two objects (here logic is provided by the comparator
    //  Collections.sort(nums);

    //comparator(my own logic)
    //    Comparator<Integer> com = new Comparator<Integer>() {
    //        public int compare(Integer i, Integer j) {
    //            if (i % 10 > j % 10)
    //                return 1;
    //            else
    //                return -1;
    //        }
    //    };

    //Collections.sort(nums,com);(it will use my own logic)

    //case2:--
    //below is my own logic to compare student when Student class does not have its own comparable logic

    Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;

    List<Student> studs= new ArrayList<>();
    studs.add(new Student(21,"Navin"));
    studs.add(new Student(12,"John"));
    studs.add(new Student(18,"Parul"));
    studs.add(new Student(20,"Kiran"));

    Collections.sort(studs,com);//it will use my logic to compare
    System.out.println(studs);

    //Collections.sort(studs);//it will use Student class logic to compare
    //System.out.println(studs);

}

//Comparator is an interface used when you want to define
// how objects should be compared/sorted, especially
// when the class itself does not have a natural ordering
// or when you want multiple different sorting rules.