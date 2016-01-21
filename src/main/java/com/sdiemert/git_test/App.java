package com.sdiemert.git_test;

/**
 * The Math app!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Welcome to the math app!" );        
        System.out.println("2+3="+Arithmetic.add(2,3));
        System.out.println("2*3="+Arithmetic.multiply(2,3));
        System.out.println("2-3="+Arithmetic.subtract(2,3));
        System.out.println("6/3="+Arithmetic.divide(6,3));
    }
}
