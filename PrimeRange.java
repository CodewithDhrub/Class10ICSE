
class PrimeRange
{
    void calculate()
    {
        for(int n = 2; n <= 100; n++)
        {
            int count = 0;

            for(int i = 1; i <= n; i++)
            {
                if(n % i == 0)
                    count++;
            }

            if(count == 2)
                System.out.print(n + " ");
        }
    }

    void display()
    {
        System.out.println("Prime numbers between 1 and 100:");

        calculate();
    }
}

class PrimeRangeDemo
{
    public static void main(String args[])
    {
        PrimeRange ob = new PrimeRange();
        ob.display();
    }
}
