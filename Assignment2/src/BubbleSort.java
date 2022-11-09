
public class BubbleSort {

	public static void main(String[] args) {
		 int ar[]= {40,28,35,19,30,15};
		 for (int i=0;i<ar.length-1;i++) {
			 for (int j=1;j<ar.length-i;j++) {
				 if (ar[j]<ar[j-1]) {
					 int temp=ar[j];
					 ar[j]=ar[j-1];
					 ar[j-1]=temp;
					 
				 }
			 }
		 }
		 System.out.println("array elements after sorted"); 
		 for (int elm:ar)
		 {
			 System.out.print(elm+" ");
	}

}
	}
