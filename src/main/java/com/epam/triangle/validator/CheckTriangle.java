package com.epam.triangle.validator;

import com.epam.triangle.creator.TriangleCreator;
import com.epam.triangle.figure.Dot;
import com.epam.triangle.figure.Triangle;
import com.epam.triangle.view.Printer;

import java.util.ArrayList;
import java.util.Collections;

public class CheckTriangle {
public final static String PATTERN_PARSER="(-?\\d+\\.\\d++)|-?\\d+";

    public static boolean checkCoordinats(String[] strings, TriangleCreator triangleCreator) {
        for (String x : strings) {
            if (x.trim().matches(PATTERN_PARSER))                               //проверка на то, что в подстроке
                triangleCreator.getCoordinates().add(Double.parseDouble(x));   //дробное или целое число с минусом или без.
            else {                                                            //Правильное значение добавляется в коллекцию.
                triangleCreator.getCoordinates().clear();                   //Неправильное очищает коллекцию и выходит из цикла,
                break;                                                     //возвращая false
            }
        }
        if (!triangleCreator.getCoordinates().isEmpty())
            return true;
            else return false;
    }


public static boolean isTriangle(Triangle triangle)
{boolean x= triangle.getSideA()+triangle.getSideB()>triangle.getSideC(); //Если сумма двух сторон больше третьей,
boolean y=triangle.getSideB()+triangle.getSideC()>triangle.getSideA();   //значит отрезки не лежат в одной плоскости
boolean z=triangle.getSideA()+triangle.getSideC()>triangle.getSideB();  // и фигура является треугольником

    if (x&&y&&z)
    {
        System.out.println("This figure is a triangle");
        return true;}
    else {
        System.out.println("this figure is not a triangle");
        return false;}
    }


public static boolean isIsosceles(Triangle triangle)
{
    double A=triangle.getSideA();
    double B=triangle.getSideB();
    double C=triangle.getSideC();
    if (A==B && A!=C || A==C && A!=B || B==C && B!=A) //Является ли треугольник равнобедренным
    {
        System.out.println("This triangle is isosceles");
        return true;
    }
    else {System.out.println("This triangle is not isosceles");
    return false;}
}

public static boolean isEquiangular(Triangle triangle)
{
    double A=triangle.getSideA();
    double B=triangle.getSideB();
    double C=triangle.getSideC();
    if (A==B && A==C)                               //Является ли треугольник равносторонним
    {
        Printer.print("This triangle is equiangular");
        return true;
    }
    else {Printer.print("This triangle is not equiangular");
    return false;}
}

public static void isRightAngled(Triangle triangle)
{
    Printer.print("The parameters of the triangle are: \n"+triangle.toString());
    double A=Math.pow(triangle.getSideA(),2);
    double B=Math.pow(triangle.getSideB(),2);
    double C=Math.pow(triangle.getSideC(),2);       //Находим квадраты сторон для определения, является ли
    double max;                                     //треугольник прямоугольным, остроугольным или тупоугольным

    ArrayList<Double> list=new ArrayList();
    list.add(A);
    list.add(B);
    list.add(C);
    Collections.sort(list);


    if (list.get(2)>list.get(1)+list.get(0))
        Printer.print("This triangle is abtuse");
    else if (list.get(2)==list.get(1)+list.get(0))
        Printer.print("This triangle is right angled");
    else if (list.get(2)<list.get(1)+list.get(0))
        Printer.print("This triangle is acute");


}

}
