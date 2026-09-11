/*
28

Factors excluding 28:
1 + 2 + 4 + 7 + 14 = 28
*/
import java.util.*;

class Perfect
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
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
                sum = sum + i;
        }
    }

    void display()
    {
        getData();
        calculate();

        if(sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}

class PerfectDemo
{
    public static void main(String args[])
    {
        Perfect ob = new Perfect();
        ob.display();
    }
}
