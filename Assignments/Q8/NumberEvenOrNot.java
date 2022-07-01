package com.yash.tdd.Assignments.Q8;

public class NumberEvenOrNot {

    static int CountingEvenOdd(int arr[])
    {
        int even_count = 0;
        int odd_count = 0;
 
        for (int i = 0; i < arr.length; i++) {
             
            if ((arr[i] & 1) == 1)
                odd_count++;
            else
                even_count++;
        }
 
        System.out.println("Number of even"
                           + " elements = " + even_count
                           + " Number of odd elements = "
                           + odd_count);
        
        return even_count;
    }
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 5, 6 };
        int n = arr.length;
           
          // Function Call
        CountingEvenOdd(arr);
    }

}
