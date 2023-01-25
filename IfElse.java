
package rohan.javaprograms;

import java.util.Scanner;

public class IfElse {
public static void main (String [] args)
{
Scanner x = new Scanner (System.in); 
int a,b;
a=x.nextInt();
b=x.nextInt();
if (a>b) {
    System.out.print(+a);
} else {
    System.out.print(+b);
}
}
}
