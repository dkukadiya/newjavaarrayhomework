//Java programme 2d array and wap to transpose a matrix
public class Transposematrix
{
    public static void main(String[] args)
    {
        int transpose[][]={{1,2,3},{4,5,6},{7,8,9}}; //Declaration of array element


        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
            System.out.print(transpose[i][j]+"   ");
            }
            System.out.println();//new line
        }
        System.out.println("Printing Matrix after transpose:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
            System.out.print(transpose[j][i]+"   ");
            }
            System.out.println();//new line
        }
    }}

