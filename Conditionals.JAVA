import java.util.Scanner;

 public class Conditionals {
    
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    
    
    //determine if a number is odd or even 
    int num;
    
    System.out.println("Enter number:");
    num = scan.nextInt();
    
    int remainder = num % 2;
    if(remainder == 0 ) {
    	System.out.println(num + " is an Even Number.");
    }else{
    	System.out.println(num + " is an ODD Number.");
    	
    }	  	  	
  
  // -------------------------------------------------
  System.out.println("--------------------------------------");
  System.out.print("Enter the temperature: ");	
  int temp = scan.nextInt();
  
   if(temp >= 36) {
     if(temp >= 46) { 
     	System.out.println("Hot!");
     }else{
     	System.out.println("Warm!");
     }
     
    }else{
        System.out.println("Cold!");
   
    }
    }
 }
