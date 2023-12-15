package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList list=new ArrayList();
        list.add(12);list.add(12);list.add(12);list.add(12);list.add(12);
        list.forEach(r-> System.out.println(r));
    }
}
