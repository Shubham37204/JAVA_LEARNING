void main() {
    //TypeConversion
    //Type conversion in Java is the
    // process of converting a value from one data type to another

    //Implicit Type Conversion Automatic(Widening)
    //Java automatically converts a smaller data
    // type to a larger one because there is no risk of data loss.
    int a = 10;
    double b = a;
    System.out.println(b);

    //Explicit Type Conversion Manual(Casting)
    //When converting from a larger type to a smaller type,
    // Java requires you to do it manually because data may be lost.
    double d = 9.8;
    int i = (int) d;
    System.out.println(i);
}

