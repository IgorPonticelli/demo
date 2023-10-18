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

        //1 ∈ {1,2,3}
        System.out.println("Conjuntio s1 contem 1?");
        System.out.println(s1.contains(1));

        // ∅ ⊂ {1,2,3}
        Set<Integer> empty = new HashSet<>();
        System.out.println(s1.containsAll(empty));

        //{1,2} ⊆ {1,2,3,4}
        Set<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(2);

        Set<Integer> s3 = new HashSet<>();
        s3.add(1);
        s3.add(2);
        s3.add(3);
        s3.add(4);
        System.out.println(s3.containsAll(s2));

        Set<Integer> dif = new HashSet<>(s3);
        dif.removeAll(s2);
        System.out.println(s3.containsAll(s2) && !dif.isEmpty());

        //{1,2,3,4} − {1,2,5} = {3,4} 
        Set<Integer> s4 = new HashSet<>();
        

    }
}
