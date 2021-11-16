//multifiction table in java using do-while loop

public class Mulifictionwhileloop
{
    public static void main(String[] args)
    {
         int i=1;
         int number;
        System.out.print("Multiplication table\n");
        do {
            int j = 1;
            do {
                System.out.printf("%2d" ,i*j);
                j++;
            } while (j <= 3);
            System.out.println("\n");
            i++;
        }while(i<=3);
    }}

