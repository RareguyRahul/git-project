
public class Moc {

	public static void main(String[] args) {
		 String str = "rahul studentof@ineuron";  
	        int[] ar= new int[str.length()];  
	        char maxChar = str.charAt(0);  
	        int i, j, max;           
	        char string[] = str.toCharArray();  
	        for(i = 0; i < string.length; i++) {    
	            for(j = i+1; j < string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
	                    ar[i]++;  
	                    string[j] = '0';  
	                }   
	            }  
	        }  
	        max = ar[0];  
	        for(i = 0; i <ar.length; i++) {  
	              
	            
	            if(max < ar[i]) {  
	                max = ar[i];  
	                maxChar = string[i];  
	            }  
	        }   
	        System.out.println("Maximum occurring character: " + maxChar);  
	    }  
	}  
