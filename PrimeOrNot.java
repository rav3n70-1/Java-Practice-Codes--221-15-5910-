
package rohan.javaprograms;

import java.util.Scanner;

public class PrimeOrNot 
{
    public static void main(String[] args)
    {
     Scanner x = new Scanner (System.in);   
     int a; 
     System.out.print("Enter Number: ");
     a=x.nextInt();
     int b = 0;
     for(int i=1;i<=a;i++)
     {
         if(a%i==0) 
         {
             b++ ;
         }
     }
     if(b==2) {
         System.out.print("Prime Number");
     } else {
         System.out.print("Not Prime Number");
     }
    }
}
