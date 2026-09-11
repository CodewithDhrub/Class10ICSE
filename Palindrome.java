
import java.util.*;

class Palindrome
{
    int n;
    int rev = 0;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        n = conin.nextInt();
    }

    void calculate()
    {
        int temp = n;

        while(temp > 0)
        {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
    }

    void display()
    {
        getData();
        calculate();

        if(n == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}

class PalindromeDemo
{
    public static void main(String args[])
    {
        Palindrome ob = new Palindrome();
        ob.display();
    }
}
/*
A palindrome number is equal to its reverse.
121<=>121
*/
