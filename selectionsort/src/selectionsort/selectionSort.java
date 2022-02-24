package selectionsort;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class selectionSort {
	static int[] arr1;
	
	public static void main(String[] args) throws IOException 
	{
		
		arr1 = createArray();
		selectionSort();
		System.out.println();
		printArray(arr1);
	}
	
	public static int[] createArray() throws IOException {
		
		int[] arr1;
		arr1 = new int[50];
		int i = 0;
		
		File file = new File("C:/Users/Casual/Desktop/arr2-1.txt");
		Scanner scanner = new Scanner(file);
		
		
		while(scanner.hasNextInt())
		{
			arr1[i++] = scanner.nextInt();

		}
		
		printArray(arr1);
		
		return arr1;
	}
	
	public static void printArray(int[] arr1) {
		
		for(int j = 0; j<arr1.length; j++)
		{
			System.out.print(arr1[j] + " ");
		}
	
	}
	
	public static void swap(int a, int b) {
		int temp = arr1[a];
		arr1[a] = arr1[b];
		arr1[b] = temp;
			
	}
	
	 public static void selectionSort()
	    {
	        int lowestValue, lowestIndex;

	        //start from first index of the array and set the initial lowest value and index to this
	        for (int i = 0; i < arr1.length - 1; i++)
	        {
	            lowestValue = arr1[i];
	            lowestIndex = i;
	            
	            for (int j = i+1; j < arr1.length; j++)
	            {
	                //start next loop beginning on next index over
	            	//loop through rest of the numbers, set new lowest value and index if less than current lowest
	                if (arr1[j] < lowestValue)
	                {
	                    lowestValue = arr1[j];
	                    lowestIndex = j;
	                }
	            }
	            //once you have gone through the rest of the numbers and found the new lowest, swap.
	            swap (i, lowestIndex);
	        }

	    }
}
