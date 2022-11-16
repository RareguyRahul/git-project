import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="RacE";
		String s2="cArE";
		char temp;
	char []ch=s1.toCharArray();
	for (int i=0;i<ch.length;i++) {
		if(ch[i]>='A'&& ch[i]<='Z') {
			ch[i]=(char)((int)(ch[i]+32));
					}
	}
	for (int i=0;i<ch.length;i++) {
		for (int j=i+1;j<ch.length;j++) {
			if (ch[i]>ch[j]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
	}
	
	char []ch1=s2.toCharArray();
	for (int i=0;i<ch1.length;i++) {
		if(ch1[i]>='A' && ch1[i]<='Z') {
			ch1[i]=(char)((int)(ch1[i]+32));
		}
	}
	for (int i=0;i<ch.length;i++) {
		for (int j=i+1;j<ch.length;j++) {
			if (ch1[i]>ch1[j]) {
				temp=ch1[i];
				ch1[i]=ch1[j];
				ch1[j]=temp; 
		 
	
	}
}
	}
	if(Arrays.equals(ch,ch1)) {
		System.out.println("it is an anagram");
	}
	else {
		System.out.println("it is not an anagram");
	}

	}
}


	



