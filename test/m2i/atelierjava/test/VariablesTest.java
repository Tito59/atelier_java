/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class VariablesTest {

    //@Test
    public void testVariablesObjects(){
        
        String txt1 = new String("couCOU");
        
        System.out.println(txt1);
    }
    
    //@Test
    public void ex1(){
        String txt1 ="Jamaique";
        String txt2 ="Kingston";
        
        System.out.println(txt1.toUpperCase() + " " + txt2.toUpperCase());    
    }

    //@Test
    public void ex2(){
        int a = 123;
        String b = "coucou";
        String c = a + " " + b;
        String d = b + " " + a;
        
        System.out.println(c);
        System.out.println(d);     
    }
    
    //@Test
    public void ex3(){
        String a = "10";
        int b = 20;
        int c;
        String d;
        
        c = b + Integer.parseInt(a);       
        System.out.println("C: " + c);
    }
    
    //@Test
    public int ex4(int nb){
        return nb * nb;       
    }
    
    //@Test
    public void test4(){
        System.out.println(ex4(9));
    }
   
    
    public int ex5(int nb,int pu){
        
        int res = 0;
        int count = 0;
        
        if(pu==0){
            res=1;
        }else{
            while(count<pu){
                //res = ;
                count ++;
            }
        }
        return res;
    }
    
    //@Test
    public void test5(){
        System.out.println(ex5(2,0));
    }
}
