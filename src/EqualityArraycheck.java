// EqalityArraychecking of two array

import java.util.Arrays;
public class EqualityArraycheck
{ public static void main(String[] args)
    {
      int[] arr={1,2,3,4,5};
      int[] arr1={1,2,4,5};

      if (Arrays.equals(arr,arr1))
            System.out.println("Array is same");
      else
            System.out.println("Not same");
    }}

