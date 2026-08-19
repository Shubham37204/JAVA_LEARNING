class Human
{
    int age;
    String name;

    public Human() //default
    {
        age=12;
        name="John";
    }
    public Human(int age, String name) //parameterized
    {
        this.age=age;
        this.name=name;
    }
    public Human(String name) {
        this.age=12;
        this.name=name;
    }
    public void show(int age)
    {
        this.age=age;
    }
}

void main() {
    Human obj=new Human();
    Human obj1=new Human(15,"shubham");
    System.out.println(obj+""+obj1);
}
//
////                                      this
////                                        │
////                            ┌──────────┼──────────┐
////                            │          │          │
////                            this.age   this.show()  this(...)
////                                │          │          │
////                        current      current     another
////                        object's     object's    constructor
////                        variable     method      of SAME class


//this.age     =     age
//   ↓                  ↓
//object's age     method's age
//(instance)       (parameter)

