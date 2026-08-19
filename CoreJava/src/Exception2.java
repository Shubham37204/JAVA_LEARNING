void main() throws NumberFormatException{
    //closing resource manually

    int i=0;
    int j=0;
    try{
        j=18/i;
    }catch(Exception e){
        System.out.println("Someting went wrong.");
    } finally {
        System.out.println("Bye");
    }

    //closing the resource automatically

    //This is called : try-with-resources

//    int num=0;
//    try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
//    {
//        num=Integer.parseInt(br.readLine());
//        System.out.println(num);
//    }
}


//Key Reasons to Use finally
// Clean up resources: Close open files, end database connections,
// or disconnect network sockets so memory does not leak.

// Guaranteed execution: Run code even when a try block throws an exception
// or a function exits early with a return statement.

// Reset states: Turn off loading spinners, hide popups, or reset
// flags no matter the outcome of an operation.

// Avoid code duplication: Write clean-up code once in the finally
// block instead of repeating it in both success and error paths

//BufferedReader
//      ↓
//readLine()
//      ↓
//IOException occurs
//      ↓
// ┌───────────────┐
// ↓               ↓
//catch          throws
// ↓               ↓
//Handle here    Pass responsibility
//                ↓
//             Caller
//                ↓
//       Does caller handle it?
//          ↙           ↘
//        YES            NO
//         ↓              ↓
//     Handle it        throws again
//                        ↓
//                     Caller
//                        ↓
//                  Eventually
//                        ↓
//                       JVM
//                        ↓
//              Prints error/stack trace
//              and terminates the program
