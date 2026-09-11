/*
1124

Sum = 1 + 1 + 2 + 4 = 8

Product = 1 × 1 × 2 × 4 = 8
*/
import java.util.*;

class Spy
{
    int n;
    int sum = 0;
    int product = 1;

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

            sum = sum + digit;
            product = product * digit;

            temp = temp / 10;
        }
    }

    void display()
    {
        getData();
        calculate();

        if(sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");
    }
}

class SpyDemo
{
    public static void main(String args[])
    {
        Spy ob = new Spy();
        ob.display();
    }
}
