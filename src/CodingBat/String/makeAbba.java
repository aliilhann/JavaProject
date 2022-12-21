package CodingBat.String;

public class makeAbba {
    /*
    Given two strings, a and b, return the result of putting them together in the order abba, e.g.
    "Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public static String makeAbba(String a, String b) {
        return a+b+b+a;

    }

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi","Bye"));
    }

}
