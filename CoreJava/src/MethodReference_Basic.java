void main() {
    List<String> names = Arrays.asList("Navin", "Harsh", "John");

    List<String> uNames = names.stream()
            .map(String::toUpperCase)
            .toList();

    System.out.println(uNames);
}

//String :: toUpperCase
//  ↑          ↑
//class      method
//String
//
//tells Java:
//
//The method I'm referring to belongs to the String class.
//
//toUpperCase
//
//tells Java:
//
//This is the method I want you to use.
//
//So:
//
//String::toUpperCase
//
//basically says:
//
//"Use the toUpperCase() method of the String class whenever you receive a String."


//**Method Reference is a shorthand syntax for a lambda expression when the lambda is simply calling an existing method.**
//
//For example, normally with a Stream we might write:
//
//```java
//names.stream()
//     .map(name -> name.toUpperCase())
//     .toList();
//```
//
//Here, the lambda takes each `name` and simply calls its existing `toUpperCase()` method.
//
//Since `toUpperCase()` is already defined in the `String` class, we can simplify this using a method reference:
//
//```java
//names.stream()
//     .map(String::toUpperCase)
//     .toList();
//```
//
//`String::toUpperCase` tells Java: "For each String received by `map()`, use the `toUpperCase()` method of that String."
//
//So, a method reference allows us to reuse an existing method directly instead of writing a lambda whose only purpose is to call that method.
//
//Similarly:
//
//```java
//student -> student.getName()
//```
//
//can become:
//
//```java
//Student::getName
//```
//
//and:
//
//```java
//name -> System.out.println(name)
//```
//
//can become:
//
//```java
//System.out::println
//```
//
//So the basic idea is:
//
//**Lambda → explicitly describe the call**
//
//```java
//x -> x.someMethod()
//```
//
//**Method Reference → directly refer to the existing method**
//
//```java
//ClassName::someMethod
//```