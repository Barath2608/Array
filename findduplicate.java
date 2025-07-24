import java.util.*;
public class findduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of array elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        for(int num: arr){
            if(!seen.add(num)){
                duplicate.add(num);

            }
        }
        for(int dup:duplicate){
            System.out.println(dup);
        }
    }
}
