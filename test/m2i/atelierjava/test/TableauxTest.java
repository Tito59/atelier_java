/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class TableauxTest extends VariablesTest {
    
    public TableauxTest() {
    }
    
    //@Test
    public void testTableaux(){
        String[] tab = new String[]{"Paris","Berlin","Londres"};
        
        for (String s : tab) { //for (int i = 0; i < tab.length ; i++)
            System.out.println(s);
        }      
        System.out.println("---Fin---");
    }
    
    //@Test
    public void testTabex2(){
        int[] nombre = new int[10];
        for(int i = 1 ; i < nombre.length ; i++){
            nombre[i] = i ;
            System.out.println(nombre[i]);
        }
        
        System.out.println("---------------------------------");
        
        for (int i : nombre) {
            VariablesTest vTest = new VariablesTest();
           
           System.out.println(vTest.ex4(i));
        }
    }

}
