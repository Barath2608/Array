import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of array elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] rev=new int[n];
        for(int i=0;i<=n-1;i++){
            rev[i]=arr[n-1-i];
        }
        for(int i=0;i<n;i++){
            System.out.print(rev[i]+" ");
        }
        
    }
    
}
