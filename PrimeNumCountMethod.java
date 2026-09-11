
import java.util.*;

class Prime
{
    int n;
    int count = 0;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        n = conin.nextInt();
    }

    void calculate()
    {
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                count++;
        }
    }

    void display()
    {
        getData();
        calculate();

        if(count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}

class PrimeDemo
{
    public static void main(String args[])
    {
        Prime ob = new Prime();
        ob.display();
    }
}
