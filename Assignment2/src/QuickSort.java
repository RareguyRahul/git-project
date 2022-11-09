public class QuickSort {  
 
int partition (int a[], int start, int end)  
{  
    int pivot = a[end]; 
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
        if (a[j] < pivot)  
        {  
            i++;
            int temp = a[i];  
            a[i] = a[j];  
            a[j] = temp;   
        }  
    }  
    int temp = a[i+1];  
    a[i+1] = a[end];  
    a[end] = temp;  
    return (i + 1);   
}  
void quick(int a[], int start, int end) 
{  
    if (start < end)  
    {  
        int p = partition(a, start, end);
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) {  
    int a[] = { 20, 10, 27, 25, 15, 9 };  
    int n = a.length;  
    System.out.println("Before sorting array elements are: ");  
    QuickSort q1 = new QuickSort ();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    System.out.println();
    System.out.println("After sorting array elements are:");  
    q1.printArr(a, n);  
    System.out.println();  
  
		 
	    }   

	}

