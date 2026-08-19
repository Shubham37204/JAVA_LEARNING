
void main() {
    List<String> names = Arrays.asList("Navin", "Lakshmi", "John", "Kishor");

    String name = names.stream()
            .filter(str -> str.contains("x"))
            .findFirst()
            .orElse("Not Found");

    System.out.println(name);
}

//What problem does Optional solve?
//
//Suppose you have:
//
//String name = getName();
//
//What if getName() returns:
//
//null
//
//Then this can cause:
//
//name.length();
//
//→ NullPointerException.
//
//Traditionally, we'd write:
//
//if (name != null) {
//    System.out.println(name.length());
//}
//
//As code becomes larger, lots of:
//
//if (x != null)
//
//checks can appear.
//
//Java introduced Optional to represent:
//
//"A value may or may not be present."
//
//2. What is Optional?
//
//Optional<T> is a container/object that can contain either:
//
//a value
//
//or:
//
//no value
//
//For example:
//
//Optional<String> name;
//
//means:
//
//"This Optional may contain a String, or it may be empty."
//
//Think:
//
//Optional<String>
//       |
//       +---- "Shubham"   → value present
//       |
//       +---- empty       → value absent
