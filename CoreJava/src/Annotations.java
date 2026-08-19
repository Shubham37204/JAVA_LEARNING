//Java annotation is a tag representing metadata
// (data about data) attached to code elements
// like classes, methods, variables, or packages
class A
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in show A");
    }
}

class B extends A
{
    @Override
//	public void showTheDataWhichBelongToThisClass()
    public void showTheDataWhichBelongsToThisClass()

    {
        System.out.println("in show B");
    }
}

void main() {
    B obj=new B();
    obj.showTheDataWhichBelongsToThisClass();
}