/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ASUS
 */
public class Manager extends Employee{
    private ArrayList<String> Document;
    
    public Manager(String name, ArrayList<String> doc){
    super(name);
    this.Document = new ArrayList<String>(doc);
    }
    
    public Collection<String> getDocument(){
    return Document;
    }
    
    public void setDoc(ArrayList<String> doc){
    this.Document = doc;
    }
    
    @Override
    public String toString(){
    return this.Name() + " " + this.Document.toString();
    }
}
