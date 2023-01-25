package rohan.javaprograms;

import java.util.Scanner;

public class LeapYear {
public static void main (String[] args)

    {        
    Scanner x = new Scanner(System.in);
    int a;
    a=x.nextInt();
    if (a%4==0)
    {
    if (a%100!=0)
    {
    if (a%400==0)
    {   
    }
    }
    }
    else 
    {
        System.out.print("Not Leap Year");
    }   
    }    
}
