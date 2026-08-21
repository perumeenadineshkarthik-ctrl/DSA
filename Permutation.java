import java.util.*;
import java.lang.*;
import java.io.*;

class Permutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		while(t -- > 0){
		    int n =sc.nextInt();
		    StringBuilder sb =new StringBuilder();
		    sb.append(n).append(" ");
		    sb.append(n-2).append(" ");
		    for(int i =1;i<=n-3;i++){
		        sb.append(i).append(" ");
		    }
		     //   for(int i =1;i<N;i++){
		       sb.append(n-1);
		       System.out.println(sb.toString());
		        }
		    }
		}

	

/*Average Permutation
You are given an integer 
N
N.

Find a permutation 
P
=
[
P
1
,
P
2
,
…
,
P
N
]
P=[P 
1
​
 ,P 
2
​
 ,…,P 
N
​
 ] of the integers 
{
1
,
2
,
…
,
N
}
{1,2,…,N} such that sum of averages of all consecutive triplets is minimized, i.e.

∑
i
=
1
N
−
2
P
i
+
P
i
+
1
+
P
i
+
2
3
i=1
∑
N−2
​
  
3
P 
i
​
 +P 
i+1
​
 +P 
i+2
​
 
​
 
is minimized.

If multiple permutations are possible, print any of them.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
The first and only line of each test case contains an integer N, the size of the permutation.
Output Format
For each test case, output on a new line a permutation which satisfies the above conditions.

Constraints
1
≤
T
≤
1000
1≤T≤1000
3
≤
N
≤
10
5
3≤N≤10 
5
 
The sum of 
N
N over all test cases won't exceed 
3
⋅
10
5
3⋅10 
5
 . */