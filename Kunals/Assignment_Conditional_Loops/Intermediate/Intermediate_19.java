package Kunals.Assignment_Conditional_Loops.Intermediate;

import java.util.Scanner;

public class Intermediate_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        sc.close();

        int hcf = 0;
        for(int i=1; i<=n1; i++){
            if(n1%i == 0 && n2%i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF of number "+n1+" and "+n2+" is: "+hcf);
    }
}
