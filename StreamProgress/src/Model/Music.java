/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Interface.IStreamable;
/**
 *
 * @author ASUS
 */
public class Music implements IStreamable {
    private String artist;
    private String album;
    private int Length;
    private int BytesSent;
    
    public Music(String artist, String album, int length, int bytesSent){
    this.artist = artist;
    this.album = album;
    this.Length = length;
    this.BytesSent = bytesSent;
    }
    
    @Override
    public int Length(){
    return this.Length;
    }
    
    @Override
    public int BytesSent(){
    return this.BytesSent;
    }
}
