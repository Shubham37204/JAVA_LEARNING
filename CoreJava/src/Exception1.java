//Types of error:-
//1. Complile - time error
//2. Runtime error -> Exception handling
//3. Logical error


//Excution Hierarchy
//Error and Exception extends Throwable class.
//Throwable class is extended by Object class.
//Error is divided into :-
//1. Thread Death
//2. Virtual Machine error ( Out of memory)
//3. IO Error
//Exception is divided into:-
//1. Runtime Exception  (Unchecked Exception)
//	- Arithmetic
//	- ArrayIndexOutOfBound
//	- Null POinter
//- It is your choose to handle or not
//2. SQL Exception   (Checked Exception)
//- It is necessary to handle
//3. IO Exception  (Checked Exception)
//- It is necessary to handle

void main() {

    //normal try catch block without multiple catch block
    int i=0;
    int j=0;

//    try{
//        j=18/i;
//    } catch(Exception e){
//        System.out.println("Something went wrong");
//    }
//    System.out.println(j);
//    System.out.println("Bye");

//    try{
//        j=18/i;
//        if(j==0){
//            throw new ArithmeticException("I don't want to do print zero");
//        }
//    }catch(ArithmeticException e) {
//        j=18/i;
//        System.out.println("that is default output"+e);
//  	System.out.println("Cannot divide by zero");
//    }catch(Exception e){
//        System.out.println("Something went wrong."+e);
//    }
//    System.out.println(j);
//    System.out.println("Bye");

    try {
        System.out.println("Outer try - start");
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Inner Arithmetic catch");
        }
        System.out.println("Outer try - end");
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Outer Array catch");
    }

}
//The inner try produces:
//
//ArrayIndexOutOfBoundsException
//
//But the inner catch only handles:
//
//catch (ArithmeticException e)
//
//So it doesn't match.
//
//Java then looks outward.
//
//Inner try
//   ↓
//ArrayIndexOutOfBoundsException
//   ↓
//Inner catch?
//   ↓
//ArithmeticException ❌
//   ↓
//Go to outer catch
//   ↓
//ArrayIndexOutOfBoundsException ✅
//   ↓
//Outer catch executes
//
//Output:
//
//Outer try - start
//Outer Array catch
//
//Notice:
//
//System.out.println("Outer try - end");
//
//doesn't execute because the exception was not handled inside the inner try-catch.