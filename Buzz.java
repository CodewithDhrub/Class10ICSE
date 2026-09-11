
import java.util.*;

class Buzz
{
    int n;

    void getData()
    {
        Scanner conin = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        n = conin.nextInt();
    }

    void display()
    {
        getData();

        if(n % 7 == 0 || n % 10 == 7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");
    }
}

class BuzzDemo
{
    public static void main(String args[])
    {
        Buzz ob = new Buzz();
        ob.display();
    }
}
