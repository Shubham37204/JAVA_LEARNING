class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCalc extends Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}

void main() {
    AdvCalc obj=new AdvCalc();
    int r1=obj.add(3, 4);
    System.out.println(r1);
}

//        | Member           | Overload? | Override? | Reason                         |
//        | ---------------- | --------- | --------- | ------------------------------ |
//        | Instance method  | ✅         | ✅         | Can be inherited and redefined |
//        | `static` method  | ✅         | ❌*        | Belongs to class, not object   |
//        | `final` method   | ✅         | ❌         | Java prevents overriding       |
//        | `private` method | ✅         | ❌         | Not inherited                  |
//        | Constructor      | ❌*        | ❌         | Constructors aren't inherited  |
//        | `main()`         | ✅         | ❌         | `static` method                |
//        | Variable/field   | ✅?        | ❌         | Fields aren't overridden       |
//        | `final` variable | —         | ❌         | Cannot be reassigned           |
