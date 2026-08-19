class Calculator
{
    int num=5; //instance variable but is stored in heap

    //instanced method and hence it can access they instance variable
    public int add(int n1, int n2) //n1 and n2 are local variable
    {
        System.out.println(num);
        return n1+n2;
    }
}

void main() {
        int data=10;  //local variable and stored in stack
        //obj, obj1 are all in the stack memory, and they are called reference variable
        Calculator obj=new Calculator();
        Calculator obj1=new Calculator();
        int r1=obj.add(3,4);//local variable and stored in stack
        obj.num=8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
}
