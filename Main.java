import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int l=sc.nextInt();
  int []a=new int[l];
  for(int i=0;i<l;i++)
  a[i]=sc.nextInt();

   int sum=sc.nextInt();

if(pairSum(a,sum))
System.out.println("YES");
else
System.out.println("NO");



  }


  public static boolean pairSum(int a[], int sum)
  {
    boolean stat=false;

    int start=0,end=a.length-1;
    while( start<end )
    {
    if(a[end]+a[start]==sum)
    {
      stat=true;
      return stat;
    }
    else if(a[end]+a[start]>sum)
    {
      end--;
    }
    else
    {
      start++;
    }   


    }


return stat;
  }
  
}