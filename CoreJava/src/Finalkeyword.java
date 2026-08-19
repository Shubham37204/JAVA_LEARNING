final class Calc//it will stop the inheritance
{
    public void show()//to stop over-ridding we can use final here like public final
    {
        System.out.println("By Navin");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

//class AdvCalc extends Calc //since calc is final it cant be inherited
//{
//    public void show()
//    {
//        System.out.println("By John");
//
//    }
//}

void main() {
//    final int num=8;//this number cant be changes
//    //num=9;
//    System.out.println(num);

        Calc obj= new Calc();
    	obj.show();
    	obj.add(4, 5);


}