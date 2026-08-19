//Wrapper Classes : it is a Java class that provides
// an object representation of a primitive value.
//int -> Integer
//char -> Character
//double -> Double

void main() {
    int num=7;
//  Integer num1=new Integer(num);     //boxing
    Integer num1=num;                  // autoboxing
    System.out.println(num1);
}

//Boxing means converting a primitive value into its corresponding wrapper object.
//Unboxing means converting a wrapper object back into a primitive.