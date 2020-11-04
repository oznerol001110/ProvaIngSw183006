package it.ingsw.ProvaLab;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyListUtil prova = new MyListUtil();
        List<Integer> lista = Arrays.asList(43,2,12,34);
        lista = prova.ordina(lista, true);
        for(Integer i : lista)
        	System.out.println(i);
    }
}
