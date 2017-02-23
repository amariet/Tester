/**
 * Amanda Torres
 * 23 February 2017
 */
public class Tester
{
    public static void main()
    {
        System.out.println("---> " + p1(1));
        //System.out.println("---> " + p2(5));
        //System.out.println("---> " + p3(0));
    }

    public Tester()
    {
    }

    public static int p1(int x)
    {
        if(x > 0)
        {
          return 1;  
        }
        else
        {
            return p1(x-1);
        }
        
        // Pre-test: will return 1
        // Post-tst: returned 1
    }
    
    public static int p2(int x)
    {
        if(x < 0)
        {
            return 1;
        }
        else
        {
            return p2(x-1);
        }
        
        // Pre-test: will return 1
        // Post-test: returned 1
    }
    
    public static int p3(int x)
    {
        if(x <= 0)
        {
            return 0;
        }
        else
        {
            return p3(x-1);
        }
    }
}
