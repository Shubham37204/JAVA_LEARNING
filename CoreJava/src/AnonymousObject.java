class A
{
    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}


void main() {
    new A();   //anonymous object
    new A().show();
}

//new A()
//   ↓
//Create object (everytime)
//   ↓
//[ A object ]
//   ↓
// .show()
//   ↓
//in A show