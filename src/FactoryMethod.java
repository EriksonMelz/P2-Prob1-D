/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eamelz
 */
public class FactoryMethod {
    
    public FormatoAudio getPlayer(String ext){
        if (ext.equalsIgnoreCase("MP3DJ"))
            return new MP3DJAdapter();
        if (ext.equalsIgnoreCase("AIFF"))
            return new aiffSuperPlayerAdapter("");
        if (ext.equalsIgnoreCase("WAV"))
            return new wavPlayerAdapter();
        if (ext.equalsIgnoreCase("WMA"))
            return new wmaPlayerAdapter();
        if(ext.equalsIgnoreCase("AACP"))
            return new AACPlayerAdapter("");
        return null;
    }
}
