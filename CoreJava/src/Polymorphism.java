class A{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("in C show");
    }
}

void main() {

    //super class referring to base class
    //dynamic method dispatch/runtime polymorphism
    //A obj=new B();

    A obj=new A();
    obj.show();

    obj=new B();
    obj.show();

    obj=new C();
    obj.show();
}
//Polymorphism:
//Many behaviour ( same object or reference has differnet behaviours)

//1. Compile time polymorphism -- Overloading
//add(int, int)
//add(int, int, int)

//2. Run time polymorphism -- Overriding
// A add(int,int)
//B add(int, int)

//1. Look at this line
//A obj = new B();
//There are actually two different things here:
//
//A obj
//│  │
//| └── reference
//└───── reference type
//new B()
//   │
//   └── actual object
//So:
//Reference type = A
//Object type = B
//You can visualize it as:
//             obj
//              │
//              ▼
//        ┌──────────────┐
//        │ B object     │
//        │              │
//        │ show()       │
//        └──────────────┘


//Method Overriding
//
//Now inheritance enters the picture.
//
//Suppose:
//
//class A {
//
//    void show() {
//        System.out.println("A show");
//    }
//}
//
//And:
//
//class B extends A {
//
//    @Override
//    void show() {
//        System.out.println("B show");
//    }
//}
//
//Here B has the same method signature as A:
//
//A → show()
//B → show()
//
//But B provides its own implementation.
//
//That's overriding.
//
//The important requirement is:
//
//Inheritance
//    +
//Same method signature
//    +
//Child provides new implementation
//    =
//Overriding
//3. Why do we need overriding?
//
//Because different child classes can behave differently.
//
//For example:
//
//class Animal {
//
//    void sound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//
//    @Override
//    void sound() {
//        System.out.println("Bark");
//    }
//}
//
//class Cat extends Animal {
//
//    @Override
//    void sound() {
//        System.out.println("Meow");
//    }
//}
//
//Now:
//
//Animal
//   │
//   ├── Dog → sound() → Bark
//   │
//   └── Cat → sound() → Meow
//
//The parent says:
//
//"Every animal has sound()."
//
//The children decide:
//
//"This is how I make sound."
//
//That's the purpose of overriding.
//
//4. Runtime Polymorphism / Dynamic Method Dispatch
//
//Now we reach the important part.
//
//Look at:
//
//Animal a = new Dog();
//
//There are two types here:
//
//Animal a = new Dog();
//   ↑          ↑
//reference   actual object
// type        type
//
//The reference is Animal.
//
//But the actual object is Dog.
//
//Now:
//
//a.sound();
//
//Which sound() should Java call?
//
//There are two:
//
//Animal.sound()
//Dog.sound()
//
//Java looks at the actual object at runtime.
//
//The object is:
//
//Dog
//
//So it calls:
//
//Dog.sound();
//
//Output:
//
//Bark
//
//This process is called:
//
//Dynamic Method Dispatch
//
//and it is the mechanism behind:
//
//Runtime Polymorphism
//
//5. Why is it called "runtime"?
//
//Because Java doesn't finally decide which overridden method implementation to execute just from:
//
//Animal a
//
//It looks at the actual object:
//
//new Dog()
//
//at runtime.
//
//So:
//
//Animal a = new Dog();
//
//a.sound();
//
//results in:
//
//Reference type → Animal
//Actual object  → Dog
//                    ↓
//               Dog.sound()
//
//That's runtime polymorphism.
