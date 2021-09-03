package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Search {



    public void PrintRowAndColomn()
    {

    Print("enter 2 numbers to calculate the area ");
    float X = ReadEllement();
    float Y = ReadEllement();
    try {
    if (Y > 0 && X > 0) {
        Print("Square : " + Multiplication(X, Y));
    }
        float Square = Multiplication(X, Y);
    Print("Enter the coverage size, 2 numbers");
    float X_coverage = ReadEllement();
    float Y_coverage = ReadEllement();
    if (Y > 0 && X > 0) {
        Print("Square Coverage : " + Multiplication(X_coverage, Y_coverage));
    }
        float SquareCoverage = Multiplication(X_coverage, Y_coverage);
        Print( "You will need a coating plate :"+Division(Square,SquareCoverage));

    } catch (Exception e) {
        Print("You made a mistake when entering the data");
    }

    }

     private float ReadEllement()
     {
         Scanner scanner = new Scanner(System.in);
         return Float.parseFloat(scanner.nextLine());
     }

     private void Print(String text)
     {
         System.out.println(text);
     }

     private float Multiplication(float x, float y) { return x*y; }
     private float Addition(float x, float y) { return x+y; }
     private double Division(float x,float y){return x/y;}
}
