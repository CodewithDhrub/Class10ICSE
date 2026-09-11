
/*
153 = 1³ + 5³ + 3³
    = 1 + 125 + 27
    = 153
*/

import java.util.*;

class Armstrong
{
    int n;
    int sum = 0;

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

            sum = sum + digit * digit * digit;

            temp = temp / 10;
        }
    }

    void display()
    {
        getData();
        calculate();

        if(sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}

class ArmstrongDemo
{
    public static void main(String args[])
    {
        Armstrong ob = new Armstrong();
        ob.display();
    }
}
