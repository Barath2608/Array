import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flargest=Integer.MIN_VALUE,slargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>flargest){
                slargest=flargest;
                flargest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]!=flargest){
                slargest=arr[i];
            }
        }
        System.out.println(flargest+" "+ slargest);
    }
}
