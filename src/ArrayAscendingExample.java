//java programme to enter any and sort the values in ascending order
public class ArrayAscendingExample
{
    public static void main(String[]args) {
        int arr[] = {5, 7, 3, 4, 2};
        int temp = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        int i=0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        //Sort the array in ascending order
        System.out.println("Elements of array sorted in ascending order: ");
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for ( i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
