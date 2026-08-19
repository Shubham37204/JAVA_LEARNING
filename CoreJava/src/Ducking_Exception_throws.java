//Suppose a method encounters a checked exception.
//Instead of handling it with try-catch, the method can say:
//"I don't want to handle this exception here. I'll pass the responsibility to whoever calls me."
//That's called exception ducking (or exception propagation).

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}

void main() {
    A obj = new A();
    try {
        obj.show();
    } catch (ClassNotFoundException e) {
        //e.printStackTrace();
    }

}
