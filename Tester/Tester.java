/**
 * Amanda Torres
 * 23 February 2017
 */
public class Tester
{
    public static void main()
    {
        //System.out.println("---> " + p6(6));
        //System.out.println("---> " + p7(1));
        //System.out.println("---> " + p8(4));
        //System.out.println("---> " + p9(2,6));
        //System.out.println("---> " + p10(4,2));
        //System.out.println("---> " + p11("pacman", 2));
    }
    
    //**********Recursion Review**********
    
    //Question 1: 
    //Answer: base case
    
    //Question 2:
    public static void p2(int x)
    {
        if(x > 0)
        {
            System.out.print(x);
            p2(x-1);
        }
        
        //Pre-test: will return 1
        //Post-tst: returned 1
    }

    //Question 3:
    public static void p3(int x)
    {
        if(x > 0)
        {
            System.out.print(x);
            p3(x-1);
        }
        
        //Pre-test: will return 54321
        //Post-test: returned 54321
    }

    //Question 4:
    public static void p4(int x)
    {
        if(x >= 0)
        {
            System.out.print(x);
            p4(x-1);
        }

        //Pre-test: will return 0
        //Post-test: returned 0
    }

    //Question 5:
    public static void p5(int x)
    {
        if(x < 5)
        {
            System.out.print(x);
            p5(x+1);
            System.out.print(x);
        }

        //Pre-test: will return 44
        //Post-test: returned 44
    }

    //Question 6:
    public static void p6(int x)
    {
        if(x < 5)
        {
            p6(x-1);
            System.out.println(x);
        }

        //Pre-test: will return nothing - if statement wasn't executed
        //Post-test: returned nothing
    }

    //Question 7:
    public static int p7(int x){
        if(x <= 3)
        {
            return 1;
        }
        else
        {
            return x + p7(x - 1);
        }

        //Pre-test: will return 1
        //Post-test: returned 1
    }

    //Question 8:
    public static int p8(int x)
    {
        if(x < 1)
        {
            return 1;
        }
        else
        {
            return x + p8(x - 1);
        }

        //Pre-test: will return 11
        //Post-test: returned 11
    }

    //Question 9:
    public static int p9(int x, int y)
    {
        if(x <= 1)
        {
            return y;
        }
        else
        {
            return p9(x - 1 , y - 1) + y;
        }

        //Pre-test: will return 11
        //Post-test: returned 11
    }

    //Question 10:
    public static int p10(int x, int y)
    {
        if(x <= 1)
        {
            return y;
        }
        else
        {
            return p10(x - 1 , y) + y;
        }

        //Pre-test: will return 8
        //Post-test: returned 8
    }

    //Question 11:
    public static String p11(String s, int pos)
    {
        if(pos > s.length())
        {
            return s.substring(0, s.length()/2);
        }
        else
        {
            return s + p11(s.substring(pos), pos + 1);
        }
        
        //Pre-test: will return 
        //Post-test: returned 
    }
    
    //Question 12:
    private int[][] maze;
    public boolean p12(int r, int c)
    {
       return ( r < maze.length  &&  c < maze[r].length );
    }
    
    //Predicted answer: c
    //Answer: c
    
    //Question 13:
    public static int p13(int[] ray, int i, int x)
    {
       if( i >= ray.length )
          return 0;
       if( ray[i] == x )
          return 1 + p13( ray, i+1, x );
       return 0 + p13( ray, i+1, x );
    }
    
    //Predicted answer: c
    //Answer: c

    //Question 14:
    public static int p14(int[] ray, int i){
       if( i >= ray.length )
          return 0;
       return ray[i] + p14( ray, i+1);
    }
    
    //Predicted answer: d
    //Answer: d
    
    //**********Sorting Review**********
    
    //Question 1:
    //Answer: compareTo()
    
    //Question 2:
    //Answer: 6, 39, 11, 12, 3, 18, 20, 5, 57
    
    //Question 3:
    //Answer: Selection Sort
    //pass 1: 12, 5, 18, 2, 9, 1
    //pass 2: 1, 5, 18, 2, 8, 12
    //pass 3: 1, 2, 18, 5, 9, 12
    //pass 4: 1, 2, 5, 18, 9, 12
    //pass 5: 1, 2, 5, 9, 18, 12
    //pass 6: 1, 2, 5, 9, 12, 18
    
    //Question 4:
    //Answer: Insertion Sort
    //pass 1: 12, 5, 18, 2, 9, 1
    //pass 2: 5, 12, 18, 2, 9, 1
    //pass 3: 5, 12, 18, 2, 9, 1
    //pass 4: 2, 5, 12, 18, 9, 1
    //pass 5: 2, 5, 9, 12, 18, 1
    //pass 6: 1, 2, 5, 9, 12, 18
    
    //Question 5:
    //Answer: 9 times max
    
    //Question 6:
    //Answer: Merge Sort
    //pass 1: {12, 5, 18, 2, 9, 1}
    //pass 2: {12, 5, 18}  {2, 9, 1}
    //pass 3: {12, 5} {18}  {2, 9} {1}
    //pass 4: {12} {5} {18} {2} {9} {1}
    //pass 5: {5, 12} {18}  {2, 9} {1}
    //pass 6: {5, 12, 18} {1, 2, 9}
    //pass 7: {1, 2, 5, 9, 12, 18}
    
    //**********Abstract Classes & Interfaces Review**********
    
    //Question 1:
    //a: false
    //b: true
    //c: true
    //d: true
    //e: true
    
    //Question 2: 
    //Answer: 1 method min
    
    //Question 3:
    //Answer: e
    
    //Question 4:
    //Answer: b
   
}
