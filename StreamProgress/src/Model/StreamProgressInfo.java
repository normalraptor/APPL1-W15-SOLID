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
public class StreamProgressInfo {
    private IStreamable file;
    
    public StreamProgressInfo(IStreamable file){
    this.file = file;
    }
    
    public int CalculatePercentage(){
     return this.file.BytesSent() * 100 / this.file.Length();
    }
}
