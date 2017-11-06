/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.HashMap;
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
    private Synthesizer synth;
    protected MidiChannel[] channels ;
    protected Instrument[] instrus;
    HashMap<String, Integer> tnote = new HashMap<String,Integer>();
    
    public Synthe(){
        
    }
    
    public Synthe(boolean on, String instrument, int volume)throws MidiUnavailableException,InterruptedException {
        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
        this.synth = MidiSystem.getSynthesizer();
        this.synth.open();
        this.channels = this.synth.getChannels();
        this.instrus = this.synth.getDefaultSoundbank().getInstruments();
        this.synth.loadAllInstruments(this.synth.getDefaultSoundbank());
        tnote.put("Do", 60);
        tnote.put("Ré", 62);
        tnote.put("Mi", 64);
        tnote.put("Fa", 65);
        tnote.put("Sol", 67);
        tnote.put("La", 69);
        tnote.put("Si", 71);
        tnote.put("Do2", 72);
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
    
//    public void jouerNote(String note)throws MidiUnavailableException, InterruptedException{
//        if(volume > 0 && on == true){
//              
//            Synthesizer synth = MidiSystem.getSynthesizer();
//            synth.open();
//            MidiChannel[] channels = synth.getChannels();
//            Instrument[] instrus = synth.getDefaultSoundbank().getInstruments();
//            synth.loadInstrument( instrus[1] );
//            channels[5].noteOn(10, 300);
//            Thread.sleep(5000);
//        }        
//    }
    
    public void sound(int channel, int note, int instrument, int duree, int bazar)throws MidiUnavailableException,InterruptedException{
        channels[channel].programChange(instrument);
        channels[channel].noteOn(note,bazar);
        Thread.sleep(duree);
        
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

    public MidiChannel[] getChannels() {
        return channels;
    }

    public void setChannels(MidiChannel[] channel) {
        if(on == true)
            this.channels = channel;
    }

    public Instrument[] getInstrus() {
        return instrus;
    }

    public void setInstrus(Instrument[] instrus) {
        if(on == true)
            this.instrus = instrus;
    }   
    
}
