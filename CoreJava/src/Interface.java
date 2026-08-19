interface A
{
    int age=44;            // final and static
    //String area="Mumbai";

    void show();
    void config();

//    default void config() {    // concrete/default method
//        System.out.println("display");
//    };
//    static void test() {        // static method
//        System.out.println("test");
//    }

    //public void configs(){System.out.println("test");}
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in cofing");
    }

}


void main() {
    A obj=new B();
    obj.show();
    obj.config();
    // A.area="Hyderabad";  //error
   // System.out.println(A.area);
}

//Interface method:
//
//void show();                  → abstract ✅
//
//default void show() { }      → concrete ✅
//
//static void show() { }       → concrete ✅
//
//private void show() { }      → concrete ✅
//
//void show() { }              → ❌
//A public instance method with a body is not allowed in an
// interface because Java needs it to be explicitly classified
// as default, static, or private; default methods are inherited,
// static methods belong to the interface, and private methods are
// internal helpers.