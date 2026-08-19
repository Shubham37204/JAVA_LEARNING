abstract class A{
    public abstract void show();
    public abstract void config();
}

void main() {
    A obj=new A()
    {
        public void show()
        {
            System.out.println("in new show");
        }
        public void config(){
            System.out.println("in config");
        }
    };
    obj.show();
}

//Normal approach
//abstract class A {
//    public abstract void show();
//}
//
//class B extends A {
//    public void show() {
//        System.out.println("B show");
//    }
//}
//
//A obj = new B();
//Anonymous approach
//abstract class A {
//    public abstract void show();
//}
//
//A obj = new A() {
//    public void show() {
//        System.out.println("Anonymous show");
//    }
//};
//
//These are conceptually doing the same thing:
//
//        A (abstract)
//        ↑
//        │ extends
//        │
//Concrete implementation
//        │
//        ↓
//     object
//
//The only difference is:
//
//Normal:
//Concrete class has a name → B
//
//Anonymous:
//Concrete class has no name
//5. And this is why obj.show() works
//
//You have:
//
//A obj
//
//So the reference type is A.
//
//But the actual object is:
//
//Anonymous subclass of A
//
//Therefore:
//
//obj.show();
//
//goes to the implementation provided by the anonymous class.
//
//Output:
//
//in new show
//
//This is also a nice example of runtime polymorphism:
//
//Reference → A
//Object    → Anonymous subclass
//                ↓
//             show()


//Need a class
//     ↓
//Need it only once
//     ↓
//Don't want to name it
//     ↓
//Anonymous class
