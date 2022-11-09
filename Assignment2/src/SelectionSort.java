
public class SelectionSort {

	public static void main(String[] args) {

	int []ar= {7,8,3,1,2,4,6,0};
	System.out.println("After selection sort the sorted elements are");
	for (int i=0;i<ar.length-1;i++) {
		int small =i;
		for (int j=i+1;j<ar.length;j++) {
			if(ar[small]>ar[j]) {
				small=j;
		}
		}
		int temp=ar[small];
		ar[small]=ar[i];
		ar[i]=temp;
		
	
	
	System.out.print(temp);
	}
	}


}
