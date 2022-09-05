import java.util.Scanner;
class subset
{ int s[],x[];//variables required to store the subset values
int d,n;
subset()//constructor
{ s=new int[10];
x=new int[10];
}
void read()//function used accept the number of sets and values in the set
{ int sum=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the total number of elements in set");
n=in.nextInt();//read number of elements in set
System.out.println("enter the set");
for(int i=1;i<=n;i++)
s[i]=in.nextInt();//accept the elements into the sets
System.out.println("enter the maximum set value");
d=in.nextInt();//maximum set value
for(int i=1;i<=n;i++)
sum=sum+s[i];//calculate the sum of all the elements
if(sum<d)//if sum is less than d or if first
System.out.println("subset is not possible");
else
System.out.println("the sets are");
subset_fun(0,1,sum);
in.close();
}
void subset_fun(int S,int k,int r)//function to find subset
{ x[k]=1;
if((S+s[k])==d)//if current value of subset k element is equal to sum then print the sets
{ for(int i=1;i<=k;i++)
if(x[i]==1)
System.out.println(+s[i]+" ");
System.out.println();
} else
if(S+s[k]+s[k+1]<=d)//if the current subset value with k and k+1 element is less than d
subset_fun(S+s[k],k+1,r-s[k]);
if((S+r-s[k]>=d)&&(S+s[k+1]<=d))
{ x[k]=0;
subset_fun(S,k+1,r-s[k]);
}
}
}
public class Sum_subset {
public static void main(String[] args)
{ subset st=new subset();
st.read();
}
}