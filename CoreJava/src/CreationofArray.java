class Student
{
    int rollno;
    String name;
    int marks;
}

void main() {
    //Create and Assign Values One by One
    //    int nums[]=new int[4];
    //    nums[0]=4;
    //    nums[1]=8;
    //    nums[2]=3;
    //    nums[3]=9;

    //Create and Initialize Together
    //int[] nums={3,5,6};

    //Using new with Initialization
//    int[] nums = new int[]{4, 8, 3, 9};
//    for (int i=0;i<4;i++) {
//        System.out.println(nums[i]);
//    }

    //2D array
//    int nums[][]=new int [3][4];
//    for(int i=0;i<3;i++)
//    {
//        for(int j=0;j<4;j++)
//        {
//            System.out.println(nums[i][j]+" ");
//        }
//        System.out.println();
//    }

    //jagged array : it is a 2D array where each row can have a different number of columns.
//    int nums[][]=new int [3][]; //jagged
//    nums[0]=new int [3];
//    nums[1]=new int [4];
//    nums[2]=new int [2];
//    nums[0][0] = 10;
//    nums[1][2] = 20;
//    nums[2][1] = 30;
//
//    for (int i = 0; i < nums.length; i++) {
//        for (int j = 0; j < nums[i].length; j++) {
//            System.out.print(nums[i][j] + " ");
//        }
//        System.out.println();
//    }

    //creation of array object
    Student s1=new Student();
    s1.rollno=1;
    s1.name="Navin";
    s1.marks=88;

    Student s2=new Student();
    s2.rollno=2;
    s2.name="Harsh";
    s2.marks=67;

    Student s3=new Student();
    s3.rollno=3;
    s3.name="Kiran";
    s3.marks=97;

    System.out.println(s1.name + ":"+ s1.marks);

    Student students[]=new Student[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;

    for(int i=0;i<students.length;i++)
    {
        System.out.println(students[i].name+":"+students[i].marks);
    }
}

//Drawbacks:-
//- The memory allocation is contiguous.
//- The size of an array is fixed. Array size cannot be expanded.
//- Searching takes time.
//- Array can store values of only same type. It can store homogeneous type value only.