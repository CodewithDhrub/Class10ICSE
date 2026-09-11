/*
145
1! + 4! + 5!
= 1 + 24 + 120
= 145
*/
import java.util.*;

class Special
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
            int fact = 1;

            for(int i = 1; i <= digit; i++)
            {
                fact = fact * i;
            }

            sum = sum + fact;

            temp = temp / 10;
        }
    }

    void display()
    {
        getData();
        calculate();

        if(sum == n)
            System.out.println("Special Number");
        else
            System.out.println("Not a Special Number");
    }
}

class SpecialDemo
{
    public static void main(String args[])
    {
        Special ob = new Special();
        ob.display();
    }
}
