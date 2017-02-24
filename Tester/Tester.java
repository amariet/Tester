/**
 * Amanda Torres
 * 23 February 2017
 */
public class Tester
{
    public static void main()
    {
        //System.out.println("---> " + p6(1));
        //System.out.println("---> " + p7(4));
        //System.out.println("---> " + p8(2,6));
        //System.out.println("---> " + p9(4,2));
        System.out.println("---> " + p10("pacman",2));
    }

    public Tester()
    {
    }

    public static void p1(int x)
    {
        if(x > 0)
        {
            System.out.print(x);
            p1(x-1);
        }

        // Pre-test: will return 1
        // Post-tst: returned 1
    }

    public static void p2(int x)
    {
        if(x > 0)
        {
            System.out.print(x);
            p2(x-1);
        }

        //Pre-test: will return 54321
        //Post-test: returned 54321
    }

    public static void p3(int x)
    {
        if(x >= 0)
        {
            System.out.print(x);
            p3(x-1);
        }

        //Pre-test: will return 0
        //Post-test: returned 0
    }

    public static void p4(int x)
    {
        if(x < 5)
        {
            System.out.print(x);
            p4(x+1);
            System.out.print(x);
        }

        //Pre-test: will return 44
        //Post-test: returned 44
    }

    public static void p5(int x)
    {
        if(6 < 5)
        {
            p5(x-1);
            System.out.println(x);
        }

        //Pre-test: will return nothing - if statement wasn't executed
        //Post-test: returned nothing
    }

    public static int p6(int x){
        if(x <= 3)
        {
            return 1;
        }
        else
        {
            return x + p6(x - 1);
        }

        //Pre-test: will return 1
        //Post-test: returned 1
    }

    public static int p7(int x)
    {
        if(x < 1)
        {
            return 1;
        }
        else
        {
            return x + p7(x - 1);
        }

        //Pre-test: will return 11
        //Post-test: returned 11
    }

    public static int p8(int x, int y)
    {
        if(x <= 1)
        {
            return y;
        }
        else
        {
            return p8(x - 1 , y - 1) + y;
        }

        //Pre-test: will return 11
        //Post-test: returned 11
    }

    public static int p9(int x, int y)
    {
        if(x <= 1)
        {
            return y;
        }
        else
        {
            return p9(x - 1 , y) + y;
        }

        //Pre-test: will return 8
        //Post-test: returned 8
    }

    public static String wow(String s, int pos)
    {
        if(pos > s.length())
        {
            return s.substring(0, s.length()/2);
        }
        else
        {
            return s + wow(s.substring(pos), pos + 1);
        }
        
        //Pre-test: will return 
        //Post-test: returned 
    }
}