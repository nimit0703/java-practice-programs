// problem:
// https://www.codechef.com/submit/DENSE?tab=statement


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereint 
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		for (int t=0;t<T;t++){
		    int n= sc.nextInt(); // length of main string
		    String s=sc.next(); // main String
		    
		  //  now we devide our string in to same length parts
		    String firsthalf = s.substring(0,n / 2);
		    String secondhalf = s.substring(n/2,n);
		    
		    int openbr=0;
		    char a = '(';
		    char b = ')';
		    int closebr=0;
		    for(int i=0;i<firsthalf.length();i++){
		        if(firsthalf.charAt(i)==a){
		            openbr++;
		        }
		    }
		    for(int i=0;i<firsthalf.length();i++){
		        if(secondhalf.charAt(i)==b){
		            closebr++;
		        }
		    }
		    int usefullbr = Math.min(openbr,closebr);
		    
		    if(s.length()==0){
		        
		    System.out.println(0);
		    }else{
		        
		    System.out.println(n- 2*usefullbr);
		    }
		    
		    
		}
		
	}
}
