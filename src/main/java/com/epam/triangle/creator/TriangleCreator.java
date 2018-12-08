package com.epam.triangle.creator;
import com.epam.triangle.figure.Dot;
import com.epam.triangle.figure.Triangle;
import com.epam.triangle.validator.CheckTriangle;
import java.util.ArrayList;


public class TriangleCreator {

    private ArrayList<Double> coordinates = new ArrayList<>();
    private Triangle triangle=new Triangle();

    public Triangle creator() throws NotEnoughCoordinatsException{
        ArrayList<String> list = Reader.readTxt();

        for (String x : list) {
            String[] substrings = this.Delimeter(list);

            if (substrings.length == 6) {     //Для треугольника требуется 6 подстрок (3 координаты X и Y)
                if (CheckTriangle.checkCoordinats(substrings,this))
                {  createDot();
                    break;}
            }
        }
if (coordinates.size()<6){  //Если в txt не нашлось 6 корректных координат в строке - треугольник создать нельзя
throw new NotEnoughCoordinatsException("This txt doesnt content enough correct coordinates to create a triangle");}

    Calculator.setSides(triangle);
    return triangle;
    }


    public String[] Delimeter(ArrayList<String> list)
    {String[] substrings=null;
        for (String x : list) {
            String delimeter = " ";
           substrings = x.split(delimeter);
    }
        return substrings;}

    private void createDot()
    {
        Dot dotA=new Dot();
        dotA.setX(coordinates.get(0));
        dotA.setY(coordinates.get(1));
        Dot dotB=new Dot();
        dotB.setX(coordinates.get(2));
        dotB.setY(coordinates.get(3));
        Dot dotC=new Dot();
        dotC.setX(coordinates.get(4));
        dotC.setY(coordinates.get(5));

        createTriangle(dotA,dotB,dotC);

    }

    private void createTriangle(Dot a, Dot b, Dot c) {
triangle.setDotA(a);
triangle.setDotB(b);
triangle.setDotC(c);
    }
    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    public Triangle getTriangle() {
        return triangle;
    }
}


class NotEnoughCoordinatsException extends Exception{
    public NotEnoughCoordinatsException(String message) {
        super(message);
    }
}