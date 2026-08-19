class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in show B");
    }
}

void main() {

    A obj=new B();   //upcasting
    A obj1=(A) new B(); //upcasting
    obj.show1();

//    B obj1=(B)obj;//downcasting
//    obj1.show2();
}

//Upcasting means:
//Converting a child-class reference into a parent-class reference eg:A obj = new B();
//That's called upcasting because you're going up the inheritance hierarchy:
//       A  ← Parent
//       ↑
//       B  ← Child

//2. What can you access after upcasting?
//
//This is very important.
//
//Suppose:
//
//class A {
//    void show() {
//        System.out.println("A show");
//    }
//}
//
//class B extends A {
//    void show() {
//        System.out.println("B show");
//    }
//
//    void run() {
//        System.out.println("B run");
//    }
//}
//Now:
//A obj = new B();
//Can you do:
//obj.show();  // ✅
//Yes.
//Because show() exists in A.
//But:
//obj.run();   // ❌
//Why?
//Because the reference type is A, and A doesn't know about run().
//Even though the actual object is B.
//So remember:
//Reference type determines what members you can access.
//But for overridden instance methods:
//Actual object determines which implementation runs.
//That's why:
//A obj = new B();
//obj.show();
//calls:
//B.show()