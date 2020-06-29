/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Interface.IStreamable;
import Model.*;
/**
 *
 * @author ASUS
 */
public class StreamProgress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IStreamable file = new File("Test", 12, 12);
        IStreamable music = new Music("Some name", "cool", 15, 2222);
        
        StreamProgressInfo streamfile = new StreamProgressInfo(file);
        StreamProgressInfo streammusic = new StreamProgressInfo(music);
        
        System.out.println(streamfile.CalculatePercentage());
        System.out.println(streammusic.CalculatePercentage());
    }
    
}
