class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    //int age is the local variable
    //obj1.age ,here age is the instance variable
    //if we write age=age then we are giving preference to local variable so both are age are local variable, they are assigning to itself
    //if we write inside setage this (ie below)
    //human obj= new human(); obj1.agw=age then we are creating a new obj all together
    public void SetAge(int age, Human obj) {
        //Human obj1=new Human();
        Human obj1 = obj;
        obj1.age = age;
        //this.age=age;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

void main() {
        Human obj=new Human();
        obj.SetAge(30,obj);
//		obj.SetAge(30);
       // obj.setName("Reddy");

//		System.out.println(obj.abc()+" : "+obj.getAge());
        System.out.println(obj.getName()+" : "+obj.getAge());

}


//Case 1: Different parameter name — no this
//class Human {
//    private int age;
//
//    public void setAge(int a) {
//        age = a;
//    }
//}
//Human obj = new Human();
//obj.setAge(30);
//When you call:
//obj.setAge(30);
//Java creates the local parameter:
//a = 30
//And the object has:
//obj
// ↓
//age = 0
//Inside:
//age = a;
//means:
//object's age = local variable a
//So:
//Before:
//obj
// ↓
//age = 0
//a = 30
//After:
//obj
// ↓
//age = 30
//Why don't we need this?
//Because the names are different:
//age = a;
//Java knows:
//age → instance variable
//a → local parameter


//Case 2: Same parameter name — use this
//Now suppose you write:
//class Human {
//    private int age;
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//And:
//Human obj = new Human();
//obj.setAge(30);
//Now there are two ages:
//instance variable → age
//local parameter   → age
//Inside:
//this.age = age;
//means:
//this.age → object's age
//age      → parameter
//So:
//this.age = age;
//   ↑       ↑
// object    parameter
//What does this mean?
//this means:the current object on which the method is being called.
//When you do:
//obj.setAge(30);
//inside setAge(), this refers to:obj
//So:
//this.age = age;
//is essentially:
//obj.age = 30;
//This is the most common use of this


//Case 3: Passing the object itself as a parameter
//Now let's look at your code:
//public void SetAge(int age, Human obj) {
//    Human obj1 = obj;
//    obj1.age = age;
//}
//And:
//Human obj = new Human();
//obj.SetAge(30, obj);
//This looks more complicated, but let's break it down.
//When you call:
//obj.SetAge(30, obj);
//you're passing two things:
//30  → age
//obj → Human obj
//So inside the method:
//public void SetAge(int age, Human obj)
//you have:
//age = 30
//obj → same Human object
//Then:
//Human obj1 = obj;
//does NOT create a new Human object.
//This is very important.
//It simply creates another reference pointing to the same object.
//             ┌───────────────┐
//obj ────────►│               │
//             │  Human object │
//obj1 ───────►│  age = 30     │
//             └───────────────┘
//Therefore:obj1.age = age;
//is effectively modifying the same object.