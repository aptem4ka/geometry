package com.epam.triangle.creator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class TriangleCreatorTest {

    @DataProvider
    public Object[][] localData(){
        return new Object[][]{
                {"1.0z 2.0 3.0 4.0 5.0 1.0", new String[]{"1.0z","2.0","3.0","4.0","5.0","1.0"}},
                {"-1.0 2.0 3.0 4.0 5.0 1.0", new String[]{"-1.0","2.0","3.0","4.0","5.0","1.0"}}
        };
    }

    @Test (dataProvider = "localData")
    public void testManualDelimeter(String string, String[]result) {
        TriangleCreator triangleCreator=new TriangleCreator();
        ArrayList<String> list=new ArrayList<>();               //Првоерка правильности разбиения на подстроки
        list.add(string);
        String[] actual=triangleCreator.Delimeter(list);
        boolean answer= Arrays.equals(actual,result);
        Assert.assertTrue(answer);
    }
}
