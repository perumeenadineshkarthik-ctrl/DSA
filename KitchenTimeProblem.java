import java.util.*;
import java.lang.*;
import java.io.*;

class KitchenTimeProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		while(t -- > 0){
		    int N =sc.nextInt();
		    int arr[]=new int [N];
		    int Brr[]=new int [N];
		    for( int i=0;i<N;i++){
		        arr[i]=sc.nextInt();
		    }
		    for( int i=0;i<N;i++){
		        Brr[i]=sc.nextInt();
		    }
		    int completed=0;
		    for(int i=0;i<N;i++){
		       if(i==0&&arr[i]>=Brr[i]){
		           
		               completed++;
		           
		       }else if(i>0){
		       int time =arr[i]-arr[i-1];
		       if(time>=Brr[i]){
		           completed++;
		           
		       }
		       
		            
		        }
		    }
		    System.out.println(completed);
		}

	}
}
