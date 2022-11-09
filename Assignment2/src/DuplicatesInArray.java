
public class DuplicatesInArray {

	public static void main(String[] args) {
		int []ar={10,30,50,90,10,20,50,30,60};
		System.out.println("Dplicate Elements In Given Array Are");
		for (int i=0;i<ar.length;i++){
			for (int j=i+1;j<ar.length;j++){
				if(ar[i]==ar[j])
				System.out.println(ar[j]);
			}
		}

	}

}
