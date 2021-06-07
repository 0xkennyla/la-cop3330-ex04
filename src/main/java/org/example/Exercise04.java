/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = scan.next();
        System.out.println("Enter a verb: ");
        String verb = scan.next();
        System.out.println("Enter an adjective: ");
        String adjective = scan.next();
        System.out.println("Enter an adverb: ");
        String adverb = scan.next();

        System.out.println("Do you " + verb + " your " + adjective +" "+ noun +" "+ adverb + "? That's hilarious!");
    }
}
