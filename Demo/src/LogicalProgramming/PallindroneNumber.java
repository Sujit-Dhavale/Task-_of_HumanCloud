package LogicalProgramming;

public class PallindroneNumber {
	
   public static void main(String[] args) {
	int n=121;
	checkPailndrome(n);
 }
   public static void checkPailndrome(int no) {
	   int temp=no;
	   int reverse=0;
	   
	   while(temp!=0) {
		    int rem=temp%10;
		    reverse=reverse*10+rem;
		    temp=temp/10;
	   }
	   
	   if (reverse==no){
	   System.out.print("is pailndrome");
	   
   }else{
   }
}}
