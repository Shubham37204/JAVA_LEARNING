class A
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }

//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}

//    static class B
//    {
//        public void config()
//        {
//            System.out.println("in config");
//        }
//    }
}

void main() {
    //Normal way of accessing Class A
    //this is the way to access all variable and method of Class A but not of Class B
    //    A obj=new A();
    //    obj.show();

    //to access the class B inside of class A
    //syntax to access inner class :--
    //OuterClass obj = new Outer();
    //OuterClass.InnerClass in = obj.new InnerClass();
    //    A.B obj1=obj.new B();
    //    obj1.config();

    //if the Class is Static then use below syntax
    //    A.B obj1=new A.B();
    //    obj1.config();

    A obj=new A()
    {
        //Anonymous Inner Class
        public void show()
        {
            System.out.println("in new show");
        }
    };
    obj.show();
}

//1. Your basic class
//class A {
//    int age;
//
//    public void show() {
//        System.out.println("in show");
//    }
//}
//
//Here A is a normal class.
//
//It has:
//
//A
//│
//├── age       → instance variable
//│
//└── show()    → instance method
//
//So normally:
//
//A obj = new A();
//obj.show();
//
//means:
//
//new A()
//  ↓
//A object
//  ↓
//obj
//  ↓
//obj.show()
//
//Output:
//
//in show
//2. Now put class B inside A
//
//You had:
//
//class A {
//
//    int age;
//
//    public void show() {
//        System.out.println("in show");
//    }
//
//    class B {
//
//        public void config() {
//            System.out.println("in config");
//        }
//    }
//}
//
//Now B is an inner class of A.
//
//Think:
//
//A
//│
//├── age
//├── show()
//│
//└── B
//     │
//     └── config()
//
//Notice something important:
//
//B is a class, not an object.
//
//You have to create a B object before calling config().
//
//3. Why can't we simply do this?
//
//You might think:
//
//A obj = new A();
//obj.config();   // ❌
//
//This doesn't work.
//
//Why?
//
//Because config() belongs to B, not directly to A.
//
//A object
//  │
//  ├── age
//  └── show()
//
//B object
//  │
//  └── config()
//
//So:
//
//obj.show();      // ✅
//obj.config();    // ❌
//4. How do we create B?
//
//For a non-static inner class, you need an object of the outer class first.
//
//A obj = new A();
//
//A.B obj1 = obj.new B();
//
//obj1.config();
//
//Let's break this strange-looking line:
//
//A.B obj1 = obj.new B();
//Left side
//A.B
//
//means:
//
//B is a class inside A.
//
//So:
//
//A.B obj1;
//
//means:
//
//obj1 is a reference variable capable of referring to a B object.
//
//Right side
//obj.new B();
//
//means:
//
//Create a B object associated with the A object referenced by obj.
//
//So:
//
//obj
// ↓
//A object
// │
// └──── B object
//         ↑
//        obj1
//
//Then:
//
//obj1.config();
//
//calls B's method.
//
//Output:
//
//in config
//5. Now make B static
//
//You also showed:
//
//static class B {
//
//    public void config() {
//        System.out.println("in config");
//    }
//}
//
//Now B is a static nested class.
//
//This changes how we create it.
//
//Previously:
//
//A obj = new A();
//A.B obj1 = obj.new B();
//
//But now we don't need an A object.
//
//We can directly write:
//
//A.B obj1 = new A.B();
//obj1.config();
//
//Why?
//
//Because static means B belongs to the class A, rather than being associated with a particular A object.
//
//So:
//
//Normal inner class:
//
//A object
//   │
//   └── B object
//
//
//Static nested class:
//
//A class
//   │
//   └── B class
//Easy comparison
//Non-static B	Static B
//class B	static class B
//Needs A object	Doesn't need A object
//obj.new B()	new A.B()
//Inner class	Static nested class
//6. Now the most interesting part: Anonymous Inner Class
//
//Your final code is:
//
//A obj = new A() {
//
//    public void show() {
//        System.out.println("in new show");
//    }
//};
//
//obj.show();
//
//This is an anonymous inner class.
//
//At first it looks strange:
//
//new A() {
//
//    public void show() {
//        System.out.println("in new show");
//    }
//}
//
//What is happening?
//
//We are saying:
//
//Create an object of a new unnamed class that extends A and provides its own implementation of show().
//
//7. Think of it this way
//
//Normally:
//
//class B extends A {
//
//    public void show() {
//        System.out.println("in new show");
//    }
//}
//
//Then:
//
//A obj = new B();
//obj.show();
//
//Output:
//
//in new show
//
//Here B has a name.
//
//A
//↑
//B
//
//But with an anonymous class, we don't give B a name.
//
//Instead:
//
//A obj = new A() {
//
//    public void show() {
//        System.out.println("in new show");
//    }
//};
//
//Java creates an unnamed subclass of A behind the scenes.
//
//Conceptually:
//
//A
//↑
//Unnamed class
//    │
//    └── show() → "in new show"
//
//And obj refers to an object of that unnamed class.
//
//8. Why is it called "anonymous"?
//
//Because the class has no name.
//
//Compare:
//
//Named class
//class B extends A {
//
//}
//
//B → name of the class.
//
//Anonymous class
//new A() {
//
//};
//
//There is no class name.
//
//That's why:
//
//Anonymous = without a name
//
//9. What happens when you call obj.show()?
//
//You wrote:
//
//A obj = new A() {
//
//    public void show() {
//        System.out.println("in new show");
//    }
//};
//
//obj.show();
//
//The reference type is:
//
//A obj
//
//But the actual object is:
//
//anonymous subclass of A
//
//So:
//
//obj
// ↓
//Anonymous A subclass object
// ↓
//overridden show()
//
//Therefore:
//
//obj.show();
//
//prints:
//
//in new show
//
//not
//
//in show
//
//This is runtime polymorphism / method overriding.
//
//10. Very important distinction
//
//This:
//
//A obj = new A();
//
//means:
//
//Create a normal object of class A.
//
//But this:
//
//A obj = new A() {
//
//    public void show() {
//        System.out.println("in new show");
//    }
//};
//
//means:
//
//Create an object of an anonymous subclass of A.
//
//So the two are different:
//
//A obj = new A();
//
//        ↓
//Actual object = A
//
//
//A obj = new A() { ... };
//
//        ↓
//Actual object = Anonymous subclass of A
