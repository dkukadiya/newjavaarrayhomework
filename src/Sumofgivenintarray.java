// java programe to sum values of an int array

public class Sumofgivenintarray
{
    public static void main(String[] args)
    {
        //Initialize array element
        int[] arr={2,4,5,7,0};
        int  i=0;
        int sum=0;

        //Loop through the array to calculate sum of elements
        while(i<arr.length)
        {
           sum =sum+arr[i];
           i++;
        }
        System.out.println("sum of the Given number is:" +sum);
    }
}
