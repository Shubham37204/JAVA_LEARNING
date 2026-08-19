//1. First: What's the problem with String?
//String is immutable.
//        String name = "Java";
//name = name + " Programming";
//Java doesn't modify the original "Java". It creates a new String:
//        "Java"
//        ↓
//        "Java Programming"
//So if you're repeatedly changing a string, creating many new objects can be inefficient.
//That's where StringBuilder and StringBuffer come in.

void main() {
    //StringBuilder is a class used to create and modify strings efficiently.
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");       // Add at end
    sb.insert(5, " Java");     // Insert
    sb.delete(5, 10);          // Delete
    sb.reverse();              // Reverse
    sb.setCharAt(0, 'h');      // Change character
    System.out.println(sb);

    //StringBuffer is very similar to StringBuilder
    StringBuffer sb1 = new StringBuffer("Hello");
    sb1.append(" World");
    sb1.insert(5, " Java");
    sb1.delete(5, 10);
    sb1.reverse();
    sb1.setCharAt(0, 'h');
    System.out.println(sb1);


}
