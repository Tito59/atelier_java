/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Formation
 */
public class Synthe {
    
    protected boolean on = false;
    protected String instrument;
    protected int volume;
    
    public Synthe(){
        
    }
    
    public void affichage(){
        String txt = String.format("Power : %s \nInstrument : %s \nVolume : %d",
                this.on,
                this.instrument,
                this.volume);
        System.out.println(txt);
    }
    
    public void allumage(){
        if(on == true){
            on = false;
            instrument = "None";
            volume = 0;
        }
        else{
            on = true;
            instrument = "Piano";
            volume = 5;
        }
        
    }
    
    public void jouerNote(String note)throws MidiUnavailableException, InterruptedException{
        if(volume > 0 && on == true){
              
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            Instrument[] instrus = synth.getDefaultSoundbank().getInstruments();
            synth.loadInstrument( instrus[1] );
            channels[5].noteOn(10, 300);
            Thread.sleep(5000);
        }        
    }
    
    public void volumePlus(){
        if(on == true && volume < 10)
            volume ++;
        
    }
    
    public void volumeMoins(){
        if(on == true && volume > 0)
            volume --;  
        
    }

    public boolean isOn() {
        return on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }
    
}
