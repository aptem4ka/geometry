package com.epam.triangle.figure;

import com.epam.triangle.creator.TriangleCreator;
import com.epam.triangle.view.Printer;

public class Create {
    private static TriangleCreator triangleCreator=new TriangleCreator();
    private static Triangle triangle;

    public static Triangle tryToCreate(){

      try {
          triangle= triangleCreator.creator();
      }catch (Exception e){
          Printer.printError(e.getMessage());
      }
    return triangle;
    }


    public Triangle getTriangle() {
        return triangle;
    }
    public TriangleCreator getTriangleCreator() {
        return triangleCreator;
    }

}
