//Threads:-
//Multiple threads run at same time in a code.
//This is known as Multithreading.
//- A thread is a smallest unit to work with. (individual task)
//- They can run parallely.
//- Multiple threads can share resources.


class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
        }
    }
}


void main() {
    A obj1=new A();
    B obj2=new B();

    //normal object
    // obj1.show();
    // obj2.show();

    //making normal object as threads
    obj1.start();
    obj2.start();
}
