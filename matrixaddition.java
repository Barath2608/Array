import java.util.*;

class matrixaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(), c=sc.nextInt();
        int[][] m=new int[r][c];
        int[][] n=new int[r][c];
        System.out.println("give m input: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("give n input: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                n[i][j]=sc.nextInt();
            }
        }
        int[][] sum=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=n[i][j]+m[i][j];
            }
            System.out.println();
        }
        
        System.out.println("op: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
