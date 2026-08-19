//Collection API/ Collection Framework -> concept
//Collection -> Interface
//Collections -> class with multiple methods

//The Collection Framework/API is the overall framework provided by Java for working with groups of objects.
// It(Collection Framework) contains different interfaces like Collection interface and Map
// interface and their implementations, such as List, Set, Queue,and HashMap ,TreeMap respectively
// Collections with an "s" is a utility class that provides methods such as sort(),
// reverse(), max(), and min() to operate on collection objects.

void main() {

    //ArrayList
//    List<Integer> nums=new ArrayList<Integer>();
//    nums.add(6);
//    nums.add(5);
//    nums.add(8);
//    nums.add(2);
//    for(Object n:nums)
//    {
//        int num=(Integer)n;
//        System.out.println(nums);
//        System.out.println(num);
//    }

//Set
//    //Set<Integer> nums=new HashSet<Integer>();
//    Set<Integer> nums=new TreeSet<Integer>();
//    nums.add(6);
//    nums.add(5);
//    nums.add(8);
//    nums.add(2);
//    for(Object n:nums)
//    {
//        int num=(Integer)n;
//        System.out.println(nums);
//        System.out.println(num);
//    }

//    Iterator<Integer> values = nums.iterator();
//
//    while(values.hasNext())
//        System.out.println(values.next());


    //Map
//  Map<String, Integer> students=new HashMap<>();
    Map<String, Integer> students=new Hashtable<>();

    students.put("Navin",56);
    students.put("Harsh",23);
    students.put("Sushil",67);
    students.put("Kiran",92);
    students.put("Harsh",45);
    System.out.println(students.keySet());
    for(String key : students.keySet()){
        System.out.println(key + ":" + students.get(key));
    }

}

//The main reason we use List/ArrayList instead of Collection is not because creating the parent object is harder.
//
//The real reason is:
//
//Collection is a general interface, while List is a more specific interface with additional behavior, and ArrayList is a concrete implementation that actually provides the storage.
//
//Let's walk through your idea.
//
//1. Collection is the general parent interface
//Collection<Integer> c = new ArrayList<>();
//
//This is perfectly valid.
//
//You can use the methods provided by Collection:
//
//c.add(10);
//c.remove(10);
//c.size();
//c.contains(10);
//
//But the Collection interface is intentionally general.
//
//It doesn't say things like:
//
//get(index)
//set(index, value)
//add(index, value)
//
//because not every kind of collection has an index.
//
//For example, a Set doesn't work with indexes.
//
//2. Then comes List
//
//List is more specific:
//
//Collection
//    ↓
//   List
//
//List says:
//
//"I am a Collection, but I additionally maintain elements in a positional/ordered manner."
//
//Therefore it provides operations such as:
//
//list.get(2);
//list.set(2, 100);
//list.add(2, 50);
//
//So now we have more capabilities.
//
//3. Then comes ArrayList
//
//But List is still an interface.
//
//We cannot do:
//
//List<Integer> list = new List<>();  // ❌
//
//So Java gives us a concrete implementation:
//
//List<Integer> list = new ArrayList<>();
//
//Now we have an actual object.
//
//Collection
//    ↑
//   List
//    ↑
//ArrayList
//    ↑
// actual object
