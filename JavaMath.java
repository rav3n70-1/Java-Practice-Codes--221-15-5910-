package rohan.javaprograms;

import java.util.Scanner;

public class JavaMath {

    public static void main(String[] args)
{
  int num1,num2;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Two Numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int Sum = num1+num2;
        System.out.print("Sum = "+Sum);  
}
    
}
