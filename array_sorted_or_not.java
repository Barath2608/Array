import java.util.*;
public class array_sorted_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of array elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean result=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                result=false;
                break;
            }
        }
        System.out.println(result);
    }
    
}
