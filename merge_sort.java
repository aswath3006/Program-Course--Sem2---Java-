import java.util.*;

class merge_sort
	{
		void sort(int[] array, int start, int end)
			{
					//Sorting
					int n=end-start;
					if(n<=1)
						return;
					int mid=start+(n/2);
					sort(array,start,mid);
					sort(array,mid,end);
					
					//Merge
					int[] temp = new int[n];
					int i=start; int j=mid;
					for(int k=0;k<n;k++)
						{
							//If middle element, i.e., last element of first half.
							if(i==mid)
								temp[k]=array[j++];
							
							//If last element, i.e., last element of second half.
							else if(j==end)
								{
									temp[k]=array[i++];
								}
							
							//Actual comparison
							//ELement of first array less than second.
							else if(array[i]>array[j])
								temp[k]=array[j++];
							//Element of second array less than first.
							else
								temp[k]=array[i++];
						}
					//Collect any left over elements.
					for(int k=0; k<n; k++)
						array[start+k]=temp[k];
			}
		public static void main(String[] args)
			{
        		merge_sort A = new merge_sort();
				Scanner scan = new Scanner( System.in );        
        		System.out.println("Merge Sort Test\n");
        		
				/* Accept number of elements */
		        System.out.println("Enter number of integer elements");
        		int size = scan.nextInt();
        		
				/* Create array of n elements */
        		int arr[] = new int[size];
		        
				/* Accept elements */
        		System.out.println("\nEnter "+ size +" integer elements");
        		for (int i = 0; i <size; i++)
            		arr[i] = scan.nextInt();
        		
				/* Call method sort */
        		A.sort(arr, 0, size);
        		
				/* Print sorted Array */
        		
				System.out.println("\nElements after sorting ");        
        		for (int i = 0; i<size; i++)
            		System.out.print(arr[i]+" ");            
        		
				System.out.println("\nExiting.....");
    		}


	}