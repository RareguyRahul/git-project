public class Subset {
public static void main(String args[])
{
	boolean flag=false;
	int []ar1= {11,1,13,21,3,7};
	int []ar2= {11,3,7,1};
	for (int i=0;i<ar1.length;i++) {
		for (int j=0;j<ar2.length;j++) {
			if(ar1[i]==ar2[j])
				break;
			flag=false;
			{
		 if (j==ar1.length)
			flag =true;
		 }
       }
	}
			if (flag=true)
				System.out.println("ar2[] is subset of ar1[]");
			else
				System.out.println("ar2[] is not subset of ar1[]");
	}
}
		
