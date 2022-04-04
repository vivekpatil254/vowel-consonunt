package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter charecter to check that the charecter is vowel or consonunt");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(c);
       /*if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            System.out.println("Entered charecter '"+c+"' is a Vowel");
       else
           System.out.println("Entered charecter '"+c+"' is a Consonant");*/
        switch (c) {
            case 'a':
                System.out.println("The entered charecter is vowel");
                break;
            case 'e':
                System.out.println("The entered charecter is vowel");
                break;
            case 'i':
                System.out.println("The entered charecter is vowel");
                break;
            case 'o':
                System.out.println("The entered charecter is vowel");
                break;
            case 'u':
                System.out.println("The entered charecter is vowel");
                break;
            default:
                System.out.println("The entered charecter is consonunt");
                break;
        }

    }
}
