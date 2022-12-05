package Assignment1;
//Draw the pattern
//4 4 4 4 4 4 4
//4 3 3 3 3 3 4
//4 3 2 2 2 3 4
//4 3 2 1 2 3 4
//4 3 2 2 2 3 4
//4 3 3 3 3 3 4
//4 4 4 4 4 4 4
public class Que1 {

	public static void printNumbers(int num)
	{
	    int size = 2 * num - 1;
	    for (int i = 0;
	             i < (size / 2) + 1; i++)
	    {
	        int m = num;
	       
	        for (int j = 0; j < i; j++)
	        {
	            System.out.print(m + " ");
	            m--;
	        }
	        
	        for (int k = 0;
	                 k < size - 2 * i; k++)
	        {
	            System.out.print(num - i + " ");
	        }
	        
	        m = num - i + 1;
	        for (int l = 0; l < i; l++)
	        {
	            System.out.print(m + " ");
	            m++;
	        }
	        System.out.println();
	    }
	    
	    for (int i = size / 2 - 1;
	             i >= 0; i--)
	    {
	 
	        int m = num;
	        for (int j = 0; j < i; j++)
	        {
	            System.out.print(m + " ");
	            m--;
	        }
	 
	        for (int k = 0;
	                 k < size - 2 * i; k++)
	        {
	            System.out.print(num - i + " ");
	        }
	 
	        m = num - i + 1;
	        for (int l = 0; l < i; l++)
	        {
	            System.out.print(m + " ");
	            m++;
	        }
	        System.out.println();
	    }
	    
	}

	public static void main (String[] args)
	{
	    int num = 4;
	 
	    printNumbers(num);
	}
	
}
