/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.MidiUnavailableException;
import m2i.atelierjava.entite.Synthe;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SyntheTest {
    
    Synthe s1 = new Synthe();
    
    public SyntheTest() {
    }
    
    @Test
    public void testSynthe() throws InterruptedException, MidiUnavailableException{
        
        s1.allumage();
        s1.setInstrument("Piano");
        s1.volumeMoins();
        s1.affichage();
        //s1.jouerNote("do");
    }   
}
