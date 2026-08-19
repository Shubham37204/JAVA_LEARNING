class Human
{
    //int age;
    //private int age=11;
    private int age;
    //String name1;
    //private String name1="Navin";
    private String name1;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        //age=age then age is the local variable, to make that instance variable
        // use this keyword as this.age =age and take age as parameter
        age=a;
    }

    public String getname1()
    {
        return name1;
    }
    public void setname1(String n)
    {
        name1=n;
    }
}

void main() {
    Human obj=new Human();
    obj.setAge(30);
//    obj.setname1("Reddy");

// below is he not good practice
//		obj.age=11;
//		obj.name1="Navin";

    System.out.println(obj.getname1()+" : "+obj.getAge());
}