package com.epam.triangle.creator;

import com.epam.triangle.figure.Dot;
import com.epam.triangle.figure.Triangle;

public class Calculator {

    public static void setSides(Triangle triangle)
    {
        double AB=findVector(triangle.getDotA(),triangle.getDotB());
        double BC=findVector(triangle.getDotB(),triangle.getDotC());
        double AC=findVector(triangle.getDotA(),triangle.getDotC());
        triangle.setSideA(AB);
        triangle.setSideB(BC);
        triangle.setSideC(AC);

    }

    private static double findVector(Dot dotA, Dot dotB)
    {
        return Math.sqrt((dotB.getX()-dotA.getX())*(dotB.getX()-dotA.getX()) //Формула поиска вектора по двум координатам
                +(dotB.getY()-dotA.getY())*(dotB.getY()-dotA.getY()));
    }

    public static double findPerimeter(Triangle triangle)
    {
        return triangle.getSideA()+triangle.getSideB()+triangle.getSideC();
    }

    public static double findSquare(Triangle triangle)
    {
        double per=findPerimeter(triangle);

        return Math.sqrt(per*(per-triangle.getSideA())*
                (per-triangle.getSideB())*
                (per-triangle.getSideC()));

    }

}
