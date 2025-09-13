import java.util.Scanner;
class uniqueno{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr= new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int[] temp=new int[n];
      int uniquecount=0;
      for(int i=0;i<n;i++){
        boolean duplicate=false;
        for(int j=0;j<uniquecount;j++){
            if(arr[i]==temp[j]){
                duplicate=true;
                break;
            }
        }
        if(!duplicate){
            temp[uniquecount]=arr[i];
            uniquecount++;
        }
      }
      for(int i=0;i<uniquecount;i++){
        System.out.print(temp[i]+" ");
      }

    }
    
}
