/*
25² = 625
625 ends with 25
*/
import java.util.*;

class Automorphic
{
    int n;
    int square;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        n = conin.nextInt();
    }

    void calculate()
    {
        square = n * n;
    }

    void display()
    {
        getData();
        calculate();

        int temp = n;
        int sq = square;
        boolean flag = true;

        while(temp > 0)
        {
            if(temp % 10 != sq % 10)
            {
                flag = false;
                break;
            }

            temp = temp / 10;
            sq = sq / 10;
        }

        if(flag)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}

class AutomorphicDemo
{
    public static void main(String args[])
    {
        Automorphic ob = new Automorphic();
        ob.display();
    }
}
