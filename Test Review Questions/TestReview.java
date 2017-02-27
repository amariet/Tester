
/**
 * Implements recursion problems from the test review questions
 * 
 * @Kara Herson
 * @2/23/2017
 */
public class TestReview
{
    public static void main()
    {
        System.out.print(fun8(4));

    }
    
    //Question 1 (no code): Base Case
    
    /*
     * Question 2
     * Prediction: 1
     * Result: 1
     */
    public static void fun2(int x)
    {
       if(x > 0)
       {
          System.out.print(x);
            fun2(x-1);
       }
    }
    
    /*
     * Question 3 (same code as q2);
     * Prediction: 54321
     * Result: 54321
     */
    
    /*
     * Question 4
     * Prediction: 0
     * Result: 0
     */
     public static void fun4(int x)
    {
       if(x >= 0)
       {
          System.out.print(x);
          fun4(x-1);
       }
    }

    /*
     * Question 5
     * Prediction: 44
     * Result: 44
     */
    public static void fun5(int x)
    {
       if(x < 5)
       {
          System.out.print(x);
          fun5(x+1);
          System.out.print(x);
       }
    }

    
    /*
     * Question 6
     * Prediction: (no output)
     * Result: (no output)
     */
    public static void fun6(int x)
    {
       if(x < 5){
          fun6(x-1);
          System.out.print(x);
        }
    }

    /*
     * Question 7
     * Prediction: 1
     * Result: 1
     */
    
    public static int fun7(int x){
       if(x < 3)
          return 1;
       else
          return x + fun7(x - 1);
    }

    
    /*
     * Question 8
     * Prediction: 11
     * Result: 11
     */
    public static int fun8(int x)
    {
       if(x < 1)
          return 1;
       else
          return x + fun8(x - 1);
    }

    /*
     * Question 9
     * Prediction: 11
     * Result: 11
     */
    public static int wacky(int x, int y)
    {
       if(x <= 1)
          return y;
       else
          return wacky(x - 1,y - 1) + y;
    }

    
    /*
     * Question 10
     * Prediction: 8
     * Result: 8
     */
    public static int go(int x, int y)
    {
       if(x <= 1)
          return y;
       else
          return go(x - 1,y) + y;
    }

    
    /*
     * Question 11
     * Prediction: "pacmancman"
     * Result: "pacmancman"
     */
    public static String wow(String s, int pos)
    {
       if(pos > s.length())
          return s.substring(0, s.length()/2);
       else
          return s + wow(s.substring(pos), pos + 1);
    }

    /*
     * Question 12
     * Answer: c
     * Result: c
     */
    private int[][] maze;
    public boolean inBounds(int r, int c)
    {
       return ( r < maze.length  &&  c < maze[r].length );
    }

    
   /*
     * Question 13
     * Prediction: answer c
     * Result: c
     */
    public static int ben(int[] ray, int i, int x)
    {
       if( i >= ray.length )
          return 0;
       if( ray[i] == x )
          return 1 + ben( ray, i+1, x );
       return 0 + ben( ray, i+1, x );
    }

    
    /*
     * Question 14
     * Prediction: answer d
     * Result: d
     */
    public static int ben(int[] ray, int i){
       if( i >= ray.length )
          return 0;
       return ray[i] + ben( ray, i+1);
    }

   /**End of recursion review**/
   
   /** Answers to sorting review**/
   /*
     * Question 1 
     * Answer: compareTo()
     */
    
    /*
     * Question 2 
     * Answer: 3 5 6 11 18 20 23 39 57
     */
    
    /*
     * Question 3
     * Answer: Selection Sort
     * pass 1: 12, 5, 18, 2, 9, 1
     * pass 2: 1, 5, 18, 2, 9, 12
     * pass 3: 1, 2, 18, 5, 9, 12
     * pass 4: 1, 2, 5, 18, 9, 12
     * pass 5: 1, 2, 5, 9, 18, 12
     * pass 6: 1, 2, 5, 9, 12, 18
     */
    
    /*
     * Question 4
     * Answer: Insertion Sort
     * pass 1: 12, 5, 18, 2, 9, 1
     * pass 2: 5, 12, 18, 2, 9, 1
     * pass 3: 5, 12, 18, 2, 9, 1
     * pass 4: 2, 5, 12, 18, 9, 1
     * pass 5: 2, 5, 9, 12, 18, 1
     * pass 6: 1, 2, 5, 9, 12, 18
     */
    
    /*
     * Question 5
     * Answer: 9
     */
    
    /*
     * Question 6
     * Answer: (each array is end-marked with curly brackets)
     * pass 1: {12, 5, 18, 2, 9, 1}
     * pass 2: {12, 5, 18}  {2, 9, 1}
     * pass 3: {12, 5} {18}  {2, 9} {1}
     * pass 4: {12} {5} {18} {2} {9} {1}
     * pass 5: {5, 12} {18}  {2, 9} {1}
     * pass 6: {5, 12, 18} {1, 2, 9}
     * pass 7: {1, 2, 5, 9, 12, 18}
     */
    
    /** End of sorting review**/
    
    /**beginning of abstract classes and interface review**/
    /*
     * Question 1
     * a) false
     * b) true
     * c) true
     * d) true
     * e) true
     */
    
     /*
     * Question 2
     * Answer: 1
     */
    
     /*
     * Question 3
     * Answer: e
     */
    
     /*
     * Question 4
     * Answer: 9
     */
}
