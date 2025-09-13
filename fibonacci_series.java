import java.util.Scanner;
class fibonacci_series{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0,b=1;
      int sum=0;
      for(int i=1;i<=n;i++){
        sum=a+b;
        System.out.print(a+" ");
        a=b;
        b=sum;
      }

    }
    
}
