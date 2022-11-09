class Merge {  
void merge(int a[], int si, int mid, int ei)    
{    
    int i, j, k;  
    int n1 = mid - si + 1;    
    int n2 = ei - mid;    
    
        int Start[] = new int[n1];  
        int End[] = new int[n2];  
 
    for (i = 0; i < n1; i++)    
    Start[i] = a[si + i];    
    for (j = 0; j < n2; j++)    
    End[j] = a[mid + 1 + j];    
      
    i = 0;
    j = 0; 
    k = si; 
      
    while (i < n1 && j < n2)    
    {    
        if(Start[i] <= End[j])    
        {    
            a[k] = Start[i];    
            i++;    
        }    
        else    
        {    
            a[k] =End[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        a[k] =Start[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        a[k] =End[j];    
        j++;    
        k++;    
    }    
}    
  
void mergeSort(int a[], int si, int ei)  
{  
    if (si < ei)   
    {  
        int mid = (si + ei) / 2;  
        mergeSort(a, si, mid);  
        mergeSort(a, mid + 1, ei);  
        merge(a, si, mid, ei);  
    }  
}  
void printArray(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
  
public static void main(String args[])  
{  
    int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
    int n = a.length;  
    Merge m1 = new Merge();  
    System.out.println("\nBefore sorting array elements are: ");  
    m1.printArray(a, n);   
    m1.mergeSort(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are: ");  
    m1.printArray(a, n);  
    System.out.println("");  
	

	}

}
