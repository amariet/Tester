
/**
 * Write a description of class TestPrep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPrep
{

    private int[] list = {2,12,11,45,52,36,5,3,1};
    /**
     * Constructor for objects of class TestPrep
     */
    public TestPrep()
    {
    }

    public void numberOne()
    {
        int total = 0;
        for(int i=1; i <= 10; i=i+3)
        {  
            for(int x=1; x <= i; x+=2)
            {     
                total = total + x;
            }
        }
        System.out.println(total);
    }

    public void numberFive()
    {
        int ap = 789;
        ap = ap % 10;
        System.out.print( ap );
    }

    public void numberThree()
    {
        System.out.print("\\dog\\cat");
    }

    public int numberSix(int num)
    {
        int ans = 0;
        if( num >=2 )
        {
            if( num >= 7)
            {
                ans += 2;
            }
            else
            {
                ans += 3;
            }
        }
        ans += 4;
        return ans;
    }

    public int number8()
    {
        int val = 0;
        for(int i=0; i < list.length; i = i + 2){
            val = val + list[i];
        }
        return val;
    }

    public void printArray()
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i]);
        }
    }

    public void one()
    {
        System.out.print("one");
    }

    public void two()
    {
        System.out.print("two");
        one();
    }

    public void number16()
    {
        for(int h = 1; h <= 10; h++)
            System.out.print(h);
    }

    public boolean check( int x )
    {
        return ( x % 2 == 0 );
    }
}

