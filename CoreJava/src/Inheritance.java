//single amd multi level inheritance
//multiple inheritance will not work as they will be ambiguity

class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}

class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

void main() {
    //Calc obj=new Calc();
    AdvCalc obj=new AdvCalc();
    int r1=obj.add(4, 5);
    int r2=obj.sub(7,3);
    int r3=obj.multi(5,3);
    int r4=obj.div(15,4);
    System.out.println(r1+" "+r2);
}

//AdvCalc 'is a' inheriting from Calc
//Calc 'has a' provided inheritant values to Advcalc