package com.alex;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char lit = 'b';

        switch(lit)
        {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("It is " + lit);
                break;


            default:
                System.out.println("It is not a, d, c, d or e");
                break;
        }



    }

}
