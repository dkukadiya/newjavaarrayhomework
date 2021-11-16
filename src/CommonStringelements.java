//java programme to find the common elements between two arrays(string values)

import java.util.Arrays;
public class CommonStringelements
{
    public static void main(String[] args) {

        String[] arr = {"Oracle","java","C","C++","C#","Vb","PHP"};
        String[] arr1 = {"Vb","C","python","PHP","C++"};
        System.out.println("Array1 : "+ Arrays.toString(arr));
        System.out.println("Array2 : "+Arrays.toString(arr1));

        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr1.length;j++)
            {
                if(arr[i].equals(arr1[j]))
                {
                    System.out.print("The commom String elements are:"+" " +" " + " " +arr[i] );
                }

            }
        }
    }
}


