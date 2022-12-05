package Practice;

public class Abc {
     // Reverse Array From index 4 and show the o/p
	//4,18,21,54,11,35  Sample Output
	public static void main(String[] args) {
		
		int arr[]= {21,54,11,35,4,18};
		
		 //n determine the number of times an array should be rotated  
        int n = 4;  
          
        //Displays original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");   
        }    
          
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
          
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
            //First element of array will be added to the end  
            arr[j] = first;  
        }  
          
        System.out.println();  
          
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    
	}
}
