abstract class Car
{

//    int age=24;
//    String area="Mumbai";
    //Abstract methods
    public abstract void drive();
    public abstract void fly();

    //concrete method
    public void playMusic()
    {
        System.out.println("play music");
    }
}

abstract class WagnoR extends Car
{
    public void drive()
    {
        System.out.println("Driving...");
    }
}

class UpdateWagnoR extends WagnoR   //concrete class
{
    public void fly()
    {
        System.out.println("flying...");
    }
}


void main() {
    Car obj=new UpdateWagnoR();
    obj.drive();
    obj.playMusic();
}

//Suppose we start with:
//
//abstract class A {
//    abstract void show();
//    abstract void run();
//    abstract void fly();
//}
//
//Now there are two possibilities for the child.
//
//Case 1: Child is NOT abstract
//class B extends A {
//
//    void show() {
//        System.out.println("show");
//    }
//
//    void run() {
//        System.out.println("run");
//    }
//
//    void fly() {
//        System.out.println("fly");
//    }
//}
//
//Because B is a concrete class, it must implement ALL abstract methods that it inherits:
//
//A
//├── show() → abstract
//├── run()  → abstract
//└── fly()  → abstract
//       ↓
//B
//├── show() → implemented ✅
//├── run()  → implemented ✅
//└── fly()  → implemented ✅
//
//Then:
//
//B obj = new B();  // ✅
//Case 2: Child IS abstract
//
//Now:
//
//abstract class B extends A {
//
//    void show() {
//        System.out.println("show");
//    }
//}
//
//Here B only implements show().
//
//It leaves:
//
//run() → abstract
//fly() → abstract
//
//That's perfectly legal because B itself is abstract.
//
//And importantly, there is no requirement about which abstract method B must implement.
//
//For example, B could instead do:
//
//abstract class B extends A {
//
//    void fly() {
//        System.out.println("fly");
//    }
//}
//
//That's also valid.
//
//Or it could implement two:
//
//abstract class B extends A {
//
//    void show() { }
//    void run() { }
//}
//
//and leave only fly() abstract.
//
//Or it could implement none:
//
//abstract class B extends A {
//}
//
//That's also valid.
//
//So your statement:
//
//"If the child is abstract, it can implement any of the abstract methods."
//
//✅ Correct.
//
//Then the next child comes
//
//Suppose:
//
//abstract class B extends A {
//
//    void show() {
//        System.out.println("show");
//    }
//}
//
//Now:
//
//class C extends B {
//
//    void run() {
//        System.out.println("run");
//    }
//
//    void fly() {
//        System.out.println("fly");
//    }
//}
//
//C implements the remaining abstract methods.
//
//So:
//
//A
//│
//├── show() → abstract
//├── run()  → abstract
//└── fly()  → abstract
//│
//▼
//abstract B
//│
//├── show() → ✅ implemented
//├── run()  → ❌ still abstract
//└── fly()  → ❌ still abstract
//│
//▼
//concrete C
//│
//├── show() → inherited from B ✅
//├── run()  → implemented here ✅
//└── fly()  → implemented here ✅
//
//Now C is complete, so:
//
//C obj = new C();  // ✅
//One correction to your last sentence
//
//You said:
//
//"in that class there will be any abstract method defined"
//
//Better to say:
//
//The final concrete class must implement all abstract methods that remain unimplemented in the inheritance chain.
//
//They don't necessarily have to be implemented directly in that final class.
//
//For example:
//
//A
// ↓
//B
// ↓
//C
//
//B might implement show(), and C might implement run().
//
//Then C inherits the already-implemented show() from B.
//
//So C doesn't need to redefine show().