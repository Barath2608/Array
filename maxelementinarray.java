import java.util.*;
public class  maxelementinarray{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    
}
