import java.util.*;

class Reverse
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

        System.out.println("Reverse = " + rev);
    }
}

class ReverseDemo
{
    public static void main(String args[])
    {
        Reverse ob = new Reverse();
        ob.display();
    }
}
