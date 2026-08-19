class Mobile{
    String brand;
    int price;
    static String name; //static variable

    //static block
    //in java when class first loads it will first call static block and
    // then create the obj so constructor will be called afterwards
    // but the class must have the obj defined
    //if there class and has constructor,static etc
    // without the obj then class will not be loaded so static block will
    // not run so nothing will be printed
    static {
        name="shubham";
    }

    public Mobile(){
        brand="";
        price=200;
    }

    public void show() {
        System.out.println(brand+" : "+price+" : "+name);
    }

    //in static methods we can't directly use instance variable
    // but if we pass obj reference then we can use it.
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
    }
}

void main() {
    Mobile obj1=new Mobile();
    obj1.brand="Apple";
    obj1.price=1500;

    //obj1.name="SmartPhone";Not a good way to call static variable.
    //calling a static variable
    Mobile.name="SmartPhone";
    obj1.show();
    //passing reference of obj to static methods so we can use instance variable inside of it.
    Mobile.show1(obj1);
}


////1. Instance variables
////class Mobile {
////    String brand;
////    int price;
////    static String name;
////}
////
////Here:
////
////String brand;
////int price;
////
////are instance variables.
////
////Each Mobile object gets its own copy:
////
////obj1 → brand = Apple, price = 1500
////obj2 → brand = Samsung, price = 2000
////
////But:
////
////static String name;
////
////is a static variable, so it belongs to the class and is shared:
////
////Mobile
////  ↓
////name = "SmartPhone"
////        2. Your show() method
////public void show() {
////    System.out.println(brand + " : " + price + " : " + name);
////}
////
////✅ Correct.
////
////show() is non-static, so it belongs to an object.
////
////Therefore, it can directly access:
////
////brand   // instance variable
////        price   // instance variable
////name    // static variable
////
////A non-static method can access both instance and static members.
////
////3. Your show1() method
////public static void show1(Mobile obj) {
////    System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
////}
////
////✅ Also correct.
////
////Normally, a static method cannot directly do:
////
////public static void show1() {
////    System.out.println(brand); // ❌
////}
////
////because brand belongs to an object, and the static method doesn't automatically know which Mobile object's brand you mean.
////
////But you passed an object:
////
////        Mobile.show1(obj1);
////
////So now:
////
////obj.brand
////obj.price
////
////tell Java exactly which object's values to access.
////
////        4. Why does obj.name work?
////
////You wrote:
////
////Mobile.name = "SmartPhone";
////
////This is the recommended way to access a static variable.
////
////You technically can write:
////
////obj1.name = "SmartPhone";
////
////and Java will generally allow it, but it is not good style, because name belongs to the class, not specifically to obj1.
////
////Prefer:
////
////Mobile.name = "SmartPhone";
////Your complete flow
////Mobile obj1 = new Mobile();
////
////obj1.brand = "Apple";
////obj1.price = 1500;
////
////Mobile.name = "SmartPhone";
////
////Memory conceptually:
////
////Mobile class
////                 │
////                         ▼
////name = SmartPhone
////                 ▲
////                         │
////                         ┌─────────┴─────────┐
////                         │                   │
////obj1                obj2
////       │
////               ├── brand = Apple
////       └── price = 1500
////
////Then:
////
////        obj1.show();
////
////works because show() is non-static.
////
////And:
////
////        Mobile.show1(obj1);
////
////works because you explicitly pass obj1 to the static method.