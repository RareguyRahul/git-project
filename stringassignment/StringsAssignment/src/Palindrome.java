
public class Palindrome {

	public static void main(String[] args) {
		int n=2552;
		int r,sum=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;    
		       sum=(sum*10)+r;    
		       n=n/10;    
		       }    
		        if(temp==sum)    
		        System.out.println("The entered number "+temp+" is a palindrome number ");    
		        else    
		        System.out.println("The entered number "+temp+" is not a palindrome");    
		  
	}
	}

	


