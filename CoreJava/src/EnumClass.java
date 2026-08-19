enum Laptop{
    //	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
    Mackbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop()
    {
        price=500;
    }

    private Laptop(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
        System.out.println("in Laptop" + this.name());
    }
}

void main() {
    //    	Laptop lap=Laptop.Mackbook;
//    	System.out.println(lap+ " : "+lap.getPrice());

    for(Laptop lap : Laptop.values())
    {
        System.out.println(lap+" : "+lap.getPrice());
    }
}

//What is Laptop?
//enum Laptop
//
//Laptop is an enum type.
//
//And you have four predefined constants:
//
//Mackbook
//XPS
//Surface
//ThinkPad
//
//Think of it as:
//
//Laptop
//│
//├── Mackbook
//├── XPS
//├── Surface
//└── ThinkPad
//
//These are not ordinary variables.
//
//They are objects of the Laptop enum type.
//
//So:
//
//Laptop.Mackbook
//
//means:
//
//Give me the Mackbook object of the Laptop enum.
//
//2. What happens with the prices?
//
//You wrote:
//
//Mackbook(2000),
//XPS(2200),
//Surface,
//ThinkPad(1800);
//
//Notice that Surface doesn't have a value.
//
//This is where the constructors become important.
//
//You have two constructors:
//
//private Laptop() {
//    price = 500;
//}
//
//and:
//
//private Laptop(int price) {
//    this.price = price;
//}
//
//Java uses the appropriate constructor depending on what you provide.
//
//Mackbook(2000)
//
//This:
//
//Mackbook(2000)
//
//calls:
//
//Laptop(int price)
//
//So:
//
//price = 2000
//XPS(2200)
//XPS(2200)
//
//calls:
//
//Laptop(int price)
//
//So:
//
//price = 2200
//Surface
//
//There is no value:
//
//Surface
//
//So Java uses the no-argument constructor:
//
//private Laptop() {
//    price = 500;
//}
//
//Therefore:
//
//Surface → price = 500
//ThinkPad(1800)
//ThinkPad(1800)
//
//calls:
//
//Laptop(int price)
//
//Therefore:
//
//ThinkPad → price = 1800
//
//So internally you can think:
//
//Mackbook → price = 2000
//XPS      → price = 2200
//Surface  → price = 500
//ThinkPad → price = 1800
//3. Why is the constructor private?
//
//You might notice:
//
//private Laptop()
//
//and:
//
//private Laptop(int price)
//
//Normally we might say:
//
//"A private constructor means nobody outside the class can create an object."
//
//But here that's exactly what we want.
//
//You cannot do:
//
//Laptop l = new Laptop(2000); // ❌
//
//You don't manually create enum objects.
//
//Java creates the enum constants for you:
//
//Laptop.Mackbook
//Laptop.XPS
//Laptop.Surface
//Laptop.ThinkPad
//
//So enum constructors are effectively controlled by Java itself.
//
//4. price is an instance variable
//private int price;
//
//Every enum constant has its own price.
//
//Think:
//
//Mackbook object
//   └── price = 2000
//
//XPS object
//   └── price = 2200
//
//Surface object
//   └── price = 500
//
//ThinkPad object
//   └── price = 1800
//
//This is similar to what we learned earlier with normal classes.
//
//5. this.price = price
//
//You already understand this concept.
//
//private Laptop(int price) {
//    this.price = price;
//}
//
//Left side:
//
//this.price
//
//→ instance variable
//
//Right side:
//
//price
//
//→ constructor parameter
//
//So:
//
//this.price = price
//
//object's price ← parameter's price
//
//For:
//
//Mackbook(2000)
//
//it becomes:
//
//Mackbook's price = 2000
//6. getPrice()
//public int getPrice() {
//    return price;
//}
//
//This simply gives us the price of the particular enum constant.
//
//For example:
//
//Laptop.Mackbook.getPrice()
//
//returns:
//
//2000
//
//And:
//
//Laptop.Surface.getPrice()
//
//returns:
//
//500
//7. Now your for loop
//
//You wrote:
//
//for(Laptop lap : Laptop.values())
//{
//    System.out.println(lap + " : " + lap.getPrice());
//}
//
//This is an enhanced for loop.
//
//The important part is:
//
//Laptop.values()
//
//Java automatically provides the values() method for an enum.
//
//It returns all enum constants.
//
//So:
//
//Laptop.values()
//
//conceptually gives:
//
//[
//    Laptop.Mackbook,
//    Laptop.XPS,
//    Laptop.Surface,
//    Laptop.ThinkPad
//]
//
//Then the loop goes one by one.
//
//8. First iteration
//lap = Laptop.Mackbook
//
//Then:
//
//lap.getPrice()
//
//returns:
//
//2000
//
//So:
//
//System.out.println(lap + " : " + lap.getPrice());
//
//prints:
//
//Mackbook : 2000
//9. Second iteration
//lap = XPS
//
//Output:
//
//XPS : 2200
//10. Third iteration
//lap = Surface
//
//Its constructor was:
//
//Laptop()
//
//which set:
//
//price = 500;
//
//So:
//
//Surface : 500
//11. Fourth iteration
//lap = ThinkPad
//
//Output:
//
//ThinkPad : 1800
//Final output
//Mackbook : 2000
//XPS : 2200
//Surface : 500
//ThinkPad : 1800
//12. What is this.name()?
//
//You also have:
//
//System.out.println("in Laptop" + this.name());
//
//name() is another method automatically available to every enum constant.
//
//For example:
//
//Laptop.Mackbook.name()
//
//returns:
//
//"Mackbook"
//
//Similarly:
//
//Laptop.XPS.name()
//
//returns:
//
//"XPS"
//
//So if you do:
//
//Laptop.Mackbook.setPrice(2500);
//
//the method does:
//
//this.price = 2500;
//
//and then:
//
//this.name()
//
//returns:
//
//Mackbook
//
//So output:
//
//in LaptopMackbook
