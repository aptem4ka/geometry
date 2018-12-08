package com.epam.triangle.creator;

import com.epam.triangle.view.Printer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class Reader {


    public static ArrayList<String> readTxt()
    {
        String fileName=null;
        ArrayList<String> list=new ArrayList<>();

  /*      ВВОД ПУТИ К ДОКУМЕНТУ С ДАННЫМИ ВРУЧНУЮ

   try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
      {     Printer.print("Enter the txt path");
            fileName=br.readLine();
          Files.lines(Paths.get(fileName)).forEach(s ->list.add(s) );
      }catch (IOException e){
          Printer.printError(e.getMessage());
      }                  */

    fileName="InputData.txt";

       try {
           Files.lines(Paths.get(fileName)).forEach(s ->list.add(s) );
       }catch (IOException e){Printer.printError(e.getMessage());}


        return list;
    }
}

