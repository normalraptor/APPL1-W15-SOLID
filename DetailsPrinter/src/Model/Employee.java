/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Employee {
    private String name;
    
    public Employee(String name){
    this.name = name;
    }
    
    public String Name(){
    return this.name;
    }
    
    public void setname(String name){
    this.name = name;
    }
    
    @Override
    public String toString(){
    return this.Name();
    }
}
