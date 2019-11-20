package sort;
import java.util.Scanner;

public class Sort {
	private int n;
	private int []a=new int[100];
public void input() 
{
	Scanner kb=new Scanner(System.in);
	System.out.println("enter n: ");
	n=(kb.nextInt());
	System.out.println("nhap mang: ");
	for(int i=0;i<n;i++) {
		System.out.print("a["+(i+1)+"]:");
		a[i]=kb.nextInt();
	}
}
public void output()
{
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
}
public void BubbleSort()
{
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++)
			if(a[j]>a[j+1]) 
			{
				int tmp=a[j];
				a[j]=a[j+1];
				a[j+1]=tmp;
			}
		System.out.println();
		output();
	}
	
}
public void SelectionSort()
{
	for(int i=0;i<n-1;i++)
		{
		int min=i;
		for(int j=i+1;j<n;j++) 
			if(a[j]<a[min])
				min=j;
		int tmp=a[min];
		a[min]=a[i];
		a[i]=tmp;
		System.out.println();
		output();
		}
}
public void InsertionSort() {
	for(int i=1;i<n;i++)
	{
		int t=a[i];
		int j=i-1;
		while(j>=0&&a[j]>t)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=t;
		System.out.println();
		output();
	}
}
public int partition(int low, int high)
{
	int pivot = a[high];  
    int i = (low-1); // index of smaller element 
    for (int j=low; j<high; j++) 
    { 
        // If current element is smaller than or 
        // equal to pivot 
        if (a[j] <= pivot) 
        { 
            i++; 

            // swap arr[i] and arr[j] 
            int temp = a[i]; 
            a[i] = a[j]; 
            a[j] = temp; 
        } 
    } 

    // swap arr[i+1] and arr[high] (or pivot) 
    int temp = a[i+1]; 
    a[i+1] = a[high]; 
    a[high] = temp; 

    return i+1; 
    
} 


/* The main function that implements QuickSort() 
  arr[] --> Array to be sorted, 
  low  --> Starting index, 
  high  --> Ending index */
void Quicksort( int low, int high) 
{ 
    if (low < high) 
    { 
        /* pi is partitioning index, arr[pi] is  
          now at right place */
        int pi = partition( low, high); 

        // Recursively sort elements before 
        // partition and after partition 
        System.out.println();
        output();
        Quicksort( low, pi-1); 
        Quicksort( pi+1, high); 
       
    } 
} 
void merge( int l, int m, int r) 
{ 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 =  r - m; 
  
    /* create temp arrays */
    int L[n1], R[n2]; 
  
    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < n1; i++) 
        L[i] = a[l + i]; 
    for (j = 0; j < n2; j++) 
        R[j] = a[m + 1+ j]; 
  
    /* Merge the temp arrays back into arr[l..r]*/
    i = 0; // Initial index of first subarray 
    j = 0; // Initial index of second subarray 
    k = l; // Initial index of merged subarray 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            a[k] = L[i]; 
            i++; 
        } 
        else
        { 
            a[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
  
    /* Copy the remaining elements of L[], if there 
       are any */
    while (i < n1) 
    { 
        a[k] = L[i]; 
        i++; 
        k++; 
    } 
  
    /* Copy the remaining elements of R[], if there 
       are any */
    while (j < n2) 
    { 
        a[k] = R[j]; 
        j++; 
        k++; 
    } 
} 
  
/* l is for left index and r is right index of the 
   sub-array of arr to be sorted */
void mergeSort( int l, int r) 
{ 
    if (l < r) 
    { 
        // Same as (l+r)/2, but avoids overflow for 
        // large l and h 
        int m = l+(r-l)/2; 
  
        // Sort first and second halves 
        mergeSort( l, m); 
        mergeSort( m+1, r); 
  
        merge( l, m, r); 
    } 
} 
	public static void main(String[] args) {
		Sort s= new  Sort();
		s.input();
		s.output();
		s.Quicksort(0,s.n-1);
		s.output();
//		s.BubbleSort();
//		System.out.println();
//		s.output();
//		s.SelectionSort();
//		System.out.println();
//		s.output();
//		s.InsertionSort();
//		s.output();
	}

}
