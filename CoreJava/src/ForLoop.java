void main() {
    for(int i=1;i<=7;i++)
    {
        System.out.println("Day"+i);
        for(int j=1;j<=9;j++)
        {
            System.out.println(" "+(j+8)+"-"+(j+9));
        }
    }

//For Each Loop
    int nums[]=new int[4];
    nums[0]=4;
    nums[1]=8;
    nums[2]=3;
    nums[3]=9;
    for(int n: nums)
    {
        System.out.println(n);
    }

}
