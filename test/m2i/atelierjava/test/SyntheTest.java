/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.MidiUnavailableException;
import m2i.atelierjava.entite.Synthe;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SyntheTest {
    
    
    Synthe s2 = new Synthe();
    
    //@Test
    public void testSynthe() throws InterruptedException, MidiUnavailableException{
        
        Synthe s1 = new Synthe(true, "Piano", 5);
        s1.sound(5, 60, 0, 500, 300);
        s1.sound(5, 62, 0, 500, 300);
        s1.sound(5, 64, 0, 500, 300);
        s1.sound(5, 65, 0, 500, 300);
        s1.sound(5, 67, 0, 500, 300);
        s1.sound(5, 69, 0, 500, 300);
        s1.sound(5, 71, 0, 500, 300);
        s1.sound(5, 72, 0, 500, 300);   
    }
    
    @Test
    public void testAllumage(){
        Assert.assertFalse(s2.isOn());
        s2.allumage();
        Assert.assertTrue(s2.isOn());
        s2.allumage();
        Assert.assertFalse(s2.isOn());
    }
    
    @Test
    public void testVolume(){
        s2.allumage();
        Assert.assertEquals(5, s2.getVolume());
        s2.volumePlus();
        s2.volumePlus();
        s2.volumePlus();
        s2.volumePlus();
        s2.volumePlus();
        s2.volumePlus();
        Assert.assertEquals(10,s2.getVolume());
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        s2.volumeMoins();
        Assert.assertEquals(0,s2.getVolume());
    }
    
}
