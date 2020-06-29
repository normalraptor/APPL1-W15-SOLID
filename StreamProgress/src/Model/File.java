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
public class File implements IStreamable {
    private String name;
    private int Length;
    private int BytesSent;
    
    public File(String name, int Length, int bytesSent){
    this.name = name;
    this.Length = Length;
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
