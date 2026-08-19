class A {

    // A's method
    public void show() {
        System.out.println("A show");
    }

    // Normal inner class
    class B {
        public void show() {
            System.out.println("B show");
        }
    }

    // Static nested class
    static class C {
        public void show() {
            System.out.println("C show");
        }
    }

    public static void main(String[] args) {

        // 1. Object of A
        A obj1 = new A();
        obj1.show();


        // 2. Object of B
        A.B obj2 = obj1.new B();
        obj2.show();


        // 3. Object of C
        A.C obj3 = new A.C();
        obj3.show();


        // 4. Anonymous class
        A obj4 = new A() {
            public void show() {
                System.out.println("Anonymous show");
            }
        };

        obj4.show();
    }
}
//A → normal class
//A obj1 = new A();
//obj1.show();
//
//Here:
//
//obj1 → A object → A.show()
//B → normal inner class
//A.B obj2 = obj1.new B();
//obj2.show();
//
//The important part is:
//
//obj1.new B()
//
//Because B is non-static, it needs an object of A.
//
//obj1
// ↓
//A object
// │
// └── B object
//       ↑
//      obj2
//
//Therefore:
//
//obj2.show();
//
//→ B.show()
//
//C → static nested class
//
//Now:
//
//static class C
//
//Because C is static, it doesn't need an A object.
//
//So we directly write:
//
//A.C obj3 = new A.C();
//obj3.show();
//
//Think:
//
//A class
// │
// └── C class
//       ↑
//       │
//   new A.C()
//
//Compare B and C:
//
//B:
//A obj1 = new A();
//A.B obj2 = obj1.new B();
//
//C:
//A.C obj3 = new A.C();


//Advantages of Using Inner Classes:
//
//Cleaner Code: Inner classes allow for a streamlined code structure by grouping related classes and interfaces within one scope.
//Encapsulation: Inner classes can access private members of the outer class, providing a more secure, encapsulated code structure.
//Code Optimization: Less code is required to define functionalities that are closely related to each other.
//Event Handling: Inner classes are often used in Java event-driven programming, particularly for implementing callbacks and event listeners within GUI applications.
