//in java, every method in class has a super
// keyword weather we write it or not  so
//if we call  B obj=new B(5); it will go to class B and run public B(int n)
//but public B has a super keyword (even if we do not write this it will execute first) and super is called
//so super will call method from parent class ie Class A public A
//since super has no parameter , it will call public A() but if it has parameter then it will call public A(int n)


class A
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        //we can use super in different way . some are below
       // super();
        super(5); //this is now go to public A(int n)
        System.out.println("in B");
    }
    public B(int n)
    {
        //this();  //call constructor of same class
        super(n);
        System.out.println("in B int");
    }
}

void main() {
    //Flow:
    //obj->public B()->public A()
    B obj=new B();

    //Flow:
    //obj->public B(n)->public A(n)
    //B obj=new B(5);
}


//super
//        │
//        ├── super()          → parent constructor with no arguments
//        ├── super(5)         → matching parent constructor
//        ├── super.show()     → parent's show() method
//        └── super.age        → parent's age variable


//this() vs super()
//This is the important distinction:
//        this()
//        ↓
//another constructor in SAME class
//super()
//        ↓
//constructor in PARENT class


//                                     super
//                                       │
//                            ┌──────────┼──────────┐
//                            │          │          │
//                           super.age  super.show() super(...)
//                                │          │          │
    //                        parent's    parent's    parent
    //                        variable    method       constructor


//                                     this
//                                       │
//                            ┌──────────┼──────────┐
//                            │          │          │
//                            this.age   this.show()  this(...)
//                            │          │          │
//                        current      current     another
//                        object's     object's    constructor
//                        variable     method      of SAME class
