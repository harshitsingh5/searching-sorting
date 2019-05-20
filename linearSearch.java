import java.util.*;
class linearSearch
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println("Enter element to be searched: ");
    int v=sc.nextInt();
    linearSearch ll=new linearSearch();
    ll.lsearch(a,v);
  }
  void lsearch(int a[], int v)
  {
    for(int i=0;i<a.length;i++)
      if (v==a[i]) {
        System.out.println("Element found at index"+i);
      }
  }
}
