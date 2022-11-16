
public class Removeduplicates {
	

	public static void main(String[] args) {
	String Dup= ("studentofineuron");
	System.out.println(Dup);
	char[] info=Dup.toCharArray();
	StringBuilder sb=new StringBuilder();
	for (int i=0;i<info.length;i++) {
		boolean repeated=false;
		for (int j=i+1;j<info.length;j++) {
			if(info[i]==info[j]) {
				repeated=true;
				break;
			}
		}
				
	if (!repeated) {
		sb.append(info[i]);
		
	}
	}
		System.out.println(sb);

	}
}

