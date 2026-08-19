class Demo{
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
}
class NavinException extends Exception
{
    public NavinException(String string)
    {
        super(string);
    }
}

void main() {
    int i=20;
    int j=0;
    try {
        //Demo.checkAge(15);
        Demo.checkAge(20);
        j=18/i;
        if(j==0) throw new NavinException("I don't want to do print zero");
    }
    catch(ArithmeticException e)
    {
        j=18/i;
        System.out.println("that is default output"+e);
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
}


//throw
//
//throw is used inside the method/body.
//
//void checkAge(int age) {
//
//    if (age < 18) {
//        throw new ArithmeticException("Not eligible");
//    }
//
//    System.out.println("Eligible");
//}
//
//Here:
//
//throw new ArithmeticException(...)
//
//means:
//
//"I am explicitly throwing this exception now."
//
//So:
//
//checkAge(15);
//
//reaches:
//
//throw new ArithmeticException(...)
//
//and the exception is created and thrown.


//throws
//
//throws is written in the method declaration.
//
//void checkAge(int age) throws ArithmeticException {
//
//    if (age < 18) {
//        throw new ArithmeticException("Not eligible");
//    }
//}
//
//Here:
//
//throws ArithmeticException
//
//means:
//
//"This method may throw an ArithmeticException; the caller should be prepared to handle it."
//
//It doesn't itself throw anything.
//
//The actual throwing is still done by:
//
//throw new ArithmeticException(...);

//THROW
// ↓
//"Throw this exception."
//
//THROWS
// ↓
//"This method throws/may throw these exceptions."

//main()
//  ↓
//calls checkAge()
//  ↓
//checkAge() starts executing
//  ↓
//condition: age < 18
//  ↓
//throw new Exception(...)
//  ↓
//exception is actually created/thrown
//  ↓
//checkAge() does not handle it
//  ↓
//because checkAge() says "throws Exception"
//  ↓
//exception propagates back to caller
//  ↓
//main()
//  ↓
//main's catch(Exception e)
//  ↓
//handle the exception
