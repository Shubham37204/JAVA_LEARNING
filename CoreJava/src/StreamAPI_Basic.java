void main() {
    List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

    // Consumer<Integer> con=new Consumer<Integer>() {
    //
    //    		public void accept(Integer n)
    //    		{
    //    			System.out.println(n);
    //    		}
    //    	};

    //collect API-->lAMBDA fUNCTION iNTERFACE --> Below code is received
    //nums.forEach(n -> System.out.println(n));

    //    	Stream<Integer> s1=nums.stream();
    //    	Stream<Integer> s2= s1.filter(n ->n%2==0);
    //    	Stream<Integer> s3= s2.map(n->n*2);
    //    	int result=s3.reduce(0,(c,e)->c+e);
    //
    //    	s2.forEach(n -> System.out.println(n));
    //    	s3.forEach(n -> System.out.println(n));
    //
    //    	s1.forEach(n-> System.out.println(n));
    //   	s1.forEach(n-> System.out.println(n));

    int result=nums.stream()
            .filter(n-> n%2==0)
            .map(n->n*2)
            .reduce(0, (c,e)-> c+e);
    System.out.println(result);


}
//streams don't normally modify the original collection
//Stream is lazy and it can be used once

//Stream vs Collection

//Collection
//Stores data
//Examples:
//List
//Set
//Map

//Stream
//Processes data
//Collection
//    ↓
//data source
//    ↓
//stream()
//    ↓
//processing pipeline
//    ↓
//result


//Connect this to what you just learned
//
//This is where your previous topic becomes useful.
//
//You just learned:
//
//Collections.sort(students, comparator);
//
//With Stream:
//
//students.stream()
//        .sorted(comparator)
//        .forEach(System.out::println);
//
//So:
//
//Collections
//    ↓
//Collections.sort()
//    ↓
//Comparator
//
//and:
//
//Collections
//    ↓
//stream()
//    ↓
//sorted(comparator)
//    ↓
//Comparator
//
//The Comparator still does the comparison logic.
//
//The Stream simply gives you a pipeline in which you can perform that sorting along with other operations.
