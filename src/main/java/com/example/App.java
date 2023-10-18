package com.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Conjuntos" );

        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(null);

        System.out.println(s1);
        System.out.println("Conjuntio s1 contem 1?");
        System.out.println(s1.contains(1));

        Set<Integer> empty = new HashSet<>();
        empty.add(3);
        
        System.out.println(s1.containsAll(empty));
    }
}
