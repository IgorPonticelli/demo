package com.example;

import java.util.*;
import java.awt.Point;

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
        System.out.println("Conjunto s1 contem 1?");
        System.out.println(s1.contains(1));

        // ∅ ⊂ {1,2,3}
        Set<Integer> empty = new HashSet<>();
        System.out.println("O conjunto vázio esta contido em s1?");
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
        System.out.println("O conjunto {1, 2} esta contido em {1, 2, 3, 4}?");
        System.out.println(s3.containsAll(s2) && !dif.isEmpty());

        //{1,2,3,4} − {1,2,5} = {3,4} 
        Set<Integer> s4 = new HashSet<>();
        s4.add(1);
        s4.add(2);
        s4.add(5);

        Set<Integer> dif2 = new HashSet<>(s3);
        dif2.removeAll(s4);
        System.out.println(dif2);

        // {1,2} × {3,4} = {(1,3), (1,4), (2,3), (2,4)}

        Set<Integer> s5 = new HashSet<>();
        s5.add(3);
        s5.add(4);
        Set<Point> prod = new HashSet<>();

        for(Integer a : s2){
            for(Integer b : s5 ){
                Point p = new Point(a,b);
                prod.add(p);
            }
        }
        System.out.println(prod);

        //2^{1,2} = {∅,{1},{2},{1,2}}
        //1° Pegar todos os subconjuntos de um conjunto
        
        Set<Integer> s6 = new HashSet<>();
        s6.add(1);
        s6.add(2);
        s6.add(null);

        System.out.println("Conjunto s6: " + s6);

        

        
        

    }
}
