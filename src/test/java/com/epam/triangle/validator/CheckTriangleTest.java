package com.epam.triangle.validator;

import com.epam.triangle.creator.Calculator;
import com.epam.triangle.figure.Create;
import com.epam.triangle.figure.Triangle;
import com.epam.triangle.view.Printer;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CheckTriangleTest {
private static Triangle triangle;

    @DataProvider
    public Object[][] coordinatesData(){
        return new Object[][]{
                {new String[]{"1b","2","4.0","4.0","3.5","2.4"}, false},
                {new String[]{"1","2","4.0","4.0","3.5","2.4"}, true},
                {new String[]{"1*","2","4.0","4.0","3.5","2.4"}, false}
        };
    }
    @Test (dataProvider = "coordinatesData")            //Проверка правильности парсинга подстрок методом checkCoordinats
    public void testCheckCoordinats(String[] input, boolean expected)
    {
       Create create=new Create();
        boolean actual=CheckTriangle.checkCoordinats(input,create.getTriangleCreator());
        Assert.assertEquals(actual,expected);
    }


    @BeforeClass
    public void createTriangle()
    {
        triangle=Create.tryToCreate();
        Calculator.setSides(triangle);
        Printer.print("Creating a figure...");
    }

    @Test
    public void testIsTriangle() {
        CheckTriangle.isTriangle(triangle);
    }

    @Test
    public void testIsIsosceles(){             //Является ли треугольник равнобедренным
        CheckTriangle.isIsosceles(triangle);
    }

    @Test
    public void testIsEquiangular()  {          //является ли треугольник равносторонним
        CheckTriangle.isEquiangular(triangle);
    }

    @Test
    public void testIsRightAngled() {           //является ли треугольник прямоугольным, остро- или тупоугольным
        CheckTriangle.isRightAngled(triangle);
    }
}