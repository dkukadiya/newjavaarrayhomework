// write a Java programme to enter any String and count the total number of 'a' in that string

public class Stringcount
{
    public static void main(String[] args)
    {
       String str="Happy alpha";
       System.out.println("The Entered string is:" +str);

        //Count the characters in the string except space
       int i=0;
       int count=0;
       while (i<str.length())
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='A')
                count++;
                i++;
        }
        //Displays the total number of characters in the string
        System.out.println("The total number a is:" + count +"times");

    }
}
