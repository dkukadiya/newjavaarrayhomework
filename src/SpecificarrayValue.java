//java programme to test if an array contains specific value
public class SpecificarrayValue
{
    public static void main(String[]args)
    {
        int Myarray[]= {23,45,67,78,90};

        int find=23;
        boolean flag=false;

        for(int i=0;i< Myarray.length-1;i++)
        {
            if (find == Myarray[i])
            {
                System.out.println("Element found at:  " + find);
                flag = true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }
    }}

