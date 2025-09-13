import java.util.Scanner;
class palindromeornot{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int len=s.length();
      boolean ispalindrome=true;
      for(int i=0;i<len/2;i++){
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            ispalindrome=false;
        }
      }
      if(ispalindrome){
        System.out.println("itz palindrome");
      }
      else{
        System.out.println("not a palindrome");
      }

    }
    
}
