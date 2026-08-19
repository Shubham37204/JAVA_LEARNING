//Types of Interface:-
//1. Normal interface
//	- an interface having two or more methods
//2. Functional interface (SAM)
//	- SAM => Single Abstract Method interface
//3. Marker interface
//	- an interface that as no methods (blank interface)


@FunctionalInterface
interface A{
    //void show();
    void show(int i);
}

//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


void main() {
    //inner class with no parameter
//    A obj=new A()
//    {
//        public void show()
//        {
//            System.out.println("in Show");
//        }
//    };

    //inner class with parameter
//    A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    obj.show(6);

    //    lambda expression with no parameter
    //    A obj = ()-> System.out.println("Hello World");
    //    obj.show();

    A obj=( i) ->System.out.println("in show "+i);
    obj.show(5);

}
