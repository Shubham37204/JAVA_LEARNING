class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }
    public String getMeAPen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
    }
    //Methods overloading
    //same name but different no of parameter(but return type)
    //same name and same no of parameter and different return type
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public double add(double n1, int n2)
    {
        return n1+n2;
    }
}

void main() {
    Computer obj=new Computer();
    obj.playMusic();
    String src=obj.getMeAPen(10);
    System.out.println(src);
}

//accessSpecifiers returnType methodName(parameters) {
//   method body
//}
//returnType → What the method returns (int, String, boolean, void, etc.)
//methodName → Name of the method.
//parameters → Input values (optional).
//method body → Code to execute.

//static int add(int a, int b) {
//    return a + b;
//}
//
//void main() {
//    int sum = add(10, 20);
//    System.out.println(sum);
//}