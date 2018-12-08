package com.epam.triangle.creator;

import com.epam.triangle.figure.Create;
import com.epam.triangle.figure.Triangle;
import com.epam.triangle.view.Printer;
import org.testng.annotations.Test;


public class CalculatorTest {

    @Test
    public void testFindPerimeter() {
        Triangle triangle;
        triangle=Create.tryToCreate();
        Calculator.setSides(triangle);
       double per= Calculator.findPerimeter(triangle);
        System.out.println("The perimeter is "+per);
    }

    @Test
    public void testFindSquare() {
        Triangle triangle;
        triangle=Create.tryToCreate();
        Calculator.setSides(triangle);
        double square=Calculator.findSquare(triangle);
       Printer.print("The square of the triangle is "+square);

    }
}